/*

 * Tue Mar 03 14:34:25 GMT 2020
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
      ClassWriter classWriter0 = new ClassWriter(4096);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 32, "Ljava/lang/Synthetic;", "Ljava/lang/Synthetic;", "Ljava/lang/Synthetic;", stringArray0, false, false);
      methodWriter0.visitVarInsn(127, (-3640));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(21);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "awWM";
      stringArray0[1] = "awWM";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-890), "awWM", "alg}4", "awWM", stringArray0, false, false);
      Label label0 = mock(Label.class, new ViolatedAssumptionAnswer());
      methodWriter0.visitLabel(label0);
      methodWriter0.visitFieldInsn(8, "awWM", "cUm9hOY8FH(EVK", "awWM");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(191);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 589, "^w-kTUX~", "^w-kTUX~", "^w-kTUX~", (String[]) null, false, false);
      methodWriter0.visitVarInsn(2, 191);
      methodWriter0.visitMaxs((-2890), 86);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(191);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 589, "^w-kTUX~", "^w-kTUX~", "^w-kTUX~", (String[]) null, false, false);
      methodWriter0.visitTypeInsn(1217, "^w-kTUX~");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(191);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 589, "^w-kTUX~", "^w-kTUX~", "^w-kTUX~", (String[]) null, false, false);
      methodWriter0.visitVarInsn(127, 1490);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(191);
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 33554432, "h8/,c}XCJp", "W^x%ul%pO=q_^)`4y", "h8/,c}XCJp", stringArray0, true, true);
      methodWriter0.visitVarInsn(16, 1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(191);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 589, "^w-kTUX~", "^w-kTUX~", "^w-kTUX~", (String[]) null, false, false);
      methodWriter0.visitIntInsn(2, 127);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(191);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "LtqbU)1Wx3q`E#`";
      stringArray0[1] = "LtqbU)1Wx3q`E#`";
      stringArray0[2] = "java/lang/Class";
      stringArray0[3] = "LtqbU)1Wx3q`E#`";
      stringArray0[4] = "java/lang/Throwable";
      stringArray0[5] = "java/lang/Throwable";
      stringArray0[6] = "java/lang/Class";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 1612, "SourceFile", "LtqbU)1Wx3q`E#`", "java/lang/Class", stringArray0, true, true);
      methodWriter0.visitFieldInsn(1, "; /O7lfWN_", "java/lang/Class", "LtqbU)1Wx3q`E#`");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 185;
      ClassWriter classWriter0 = new ClassWriter(185);
      Label label0 = new Label();
      MethodWriter.getNewOffset(intArray0, intArray0, label0);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "java/lang/Throwable", "LtqbU)1Wx3q`E#`", "SourceFile", (String[]) null, true, false);
      methodWriter0.visitFieldInsn(585, "LtqbU)1Wx3q`E#`", " w%ge\":@gRYHA/U", "RuntimeVisibleAnnotations");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(185);
      classWriter0.addUninitializedType("wR*j PxuI", 1620);
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2, "java/lang/Throwable", "LtqbU)1Wx3q`E#`", "SourceFile", (String[]) null, true, false);
      methodWriter0.visitFieldInsn(585, "LtqbU)1Wx3q`E#`", " w%ge\":@gRYHA/U", "RuntimeVisibleAnnotations");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1267));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "qe,g#t]y6)g,7m1=(6";
      stringArray0[1] = "qe,g#t]y6)g,7m1=(6";
      stringArray0[2] = "qe,g#t]y6)g,7m1=(6";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2675, "qe,g#t]y6)g,7m1=(6", "qe,g#t]y6)g,7m1=(6", "qe,g#t]y6)g,7m1=(6", stringArray0, true, false);
      methodWriter0.visitVarInsn(16, (-1267));
      // Undeclared exception!
      try { 
        methodWriter0.visitLineNumber(93, (Label) null);
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
      ClassWriter classWriter0 = new ClassWriter(191);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "A";
      stringArray0[1] = "A";
      stringArray0[2] = "A";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 248, "c&}W'\"X`6+", "A", "A", stringArray0, false, false);
      methodWriter0.visitVarInsn(1, (-984));
      methodWriter0.visitMaxs((-1721477347), 1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1267));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "qe,g#t]y6)g,7m1=(6";
      stringArray0[1] = "qe,g#t]y6)g,7m1=(6";
      stringArray0[2] = "qe,g#t]y6)g,7m1=(6";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 2675, "qe,g#t]y6)g,7m1=(6", "qe,g#t]y6)g,7m1=(6", "qe,g#t]y6)g,7m1=(6", stringArray0, true, false);
      methodWriter0.visitTypeInsn(2675, "qe,g#t]y6)g,7m1=(6");
  }
}
