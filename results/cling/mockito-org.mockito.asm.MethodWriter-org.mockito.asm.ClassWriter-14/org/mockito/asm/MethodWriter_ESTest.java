/*

 * Tue Mar 03 14:32:50 GMT 2020
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
import org.mockito.asm.ClassReader;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Label;
import org.mockito.asm.MethodWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MethodWriter_ESTest extends MethodWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 927);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "java/lang/Object";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 4, "java/lang/Object", "java/lang/Object", "", stringArray0, false, false);
      methodWriter0.visitVarInsn(2, (-1970684375));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "RuntimeInvisibleParameterAnnotations";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 165, "RuntimeInvisibleParameterAnnotations", "", "LocalVariableTypeTable", stringArray0, false, false);
      methodWriter0.visitFieldInsn(267, "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", "}m,poN}G\"d=<");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-3661), 16777222).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[0];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-3661), "SHOS[M_m\"", "UKOT'Be').Fb\"]/l", "UKOT'Be').Fb\"]/l", stringArray0, false, false);
      methodWriter0.visitVarInsn(16777222, 0);
      methodWriter0.visitMaxs(115, 2);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1724);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "RuntimeInvisibleParameterAnnotations";
      stringArray0[1] = "RuntimeInvisibleParameterAnnotations";
      stringArray0[2] = "RuntimeInvisibleParameterAnnotations";
      stringArray0[3] = "RuntimeInvisibleParameterAnnotations";
      stringArray0[4] = "RuntimeInvisibleParameterAnnotations";
      stringArray0[5] = "RuntimeInvisibleParameterAnnotations";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-25), "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", stringArray0, false, false);
      methodWriter0.visitTypeInsn(1695, "228<|L0`");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4854));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "UKOT'Be').Fb\"]/l";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, (-149), "UKOT'Be').Fb\"]/l", "UKOT'Be').Fb\"]/l", "UKOT'Be').Fb\"]/l", stringArray0, true, false);
      methodWriter0.visitIntInsn(82, 10);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "RuntimeInvisibleParameterAnnotations";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 268435463, "", "yqn6)od4}fLjx5|`[O", "", stringArray0, true, true);
      methodWriter0.visitFieldInsn(2, "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations");
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-121), (-121), (-121)).when(classWriter0).newClass(anyString());
      doReturn((-121), (-121)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[3];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 255, "maa<Fk*G+cmZS69:/SU", "')^I{1_", "NYj{H9f", stringArray0, true, false);
      // Undeclared exception!
      try { 
        methodWriter0.visitVarInsn(255, 76);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 255
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "UKOT'Be').Fb\"]/l";
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 262144, "UKOT'Be').Fb\"]/l", "UKOT'Be').Fb\"]/l", "SHOS[M_m\"", stringArray0, false, false);
      methodWriter0.visitVarInsn(16, 1695);
      methodWriter0.visitMaxs((-1), 16777216);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ClassWriter classWriter0 = mock(ClassWriter.class, new ViolatedAssumptionAnswer());
      doReturn((-121)).when(classWriter0).newClass(anyString());
      doReturn((-121), (-121)).when(classWriter0).newUTF8(anyString());
      String[] stringArray0 = new String[1];
      MethodWriter methodWriter0 = new MethodWriter(classWriter0, 55, (String) null, "LQ#2[)+*TctH", "RuntimeInvisibleParameterAnnotations", stringArray0, true, true);
      methodWriter0.visitVarInsn(55, 55);
      // Undeclared exception!
      try { 
        methodWriter0.visitLineNumber(74, (Label) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.MethodWriter", e);
      }
  }
}
