/*

 * Tue Mar 03 14:05:15 GMT 2020
 */

package org.mockito.cglib.transform.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.ClassAdapter;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Type;
import org.mockito.cglib.core.ClassEmitter;
import org.mockito.cglib.core.CodeEmitter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AddDelegateTransformer_ESTest extends AddDelegateTransformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6811));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String string0 = "C!VK~dw<\\u-qF}";
      classEmitter0.visit(2147483645, 2147483645, "$29", string0, string0, (String[]) null);
      // Undeclared exception!
      try { 
        classEmitter0.getStaticHook();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // static hook is invalid for this class
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.visit(2, 2, ", ,9", ", ,9", ", ,9", (String[]) null);
      classEmitter0.getStaticHook();
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(287);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      ClassEmitter classEmitter0 = new ClassEmitter(classAdapter0);
      Type type0 = Type.getObjectType("`DGeea2");
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      classEmitter0.begin_class(1, (-2162), "`DGeea2", type0, typeArray0, "`DGeea2");
      assertEquals(7, Type.LONG);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6811));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.visit(2, 2, ", ,9", ", ,9", ", ,9", (String[]) null);
      classEmitter0.getStaticHook();
      classEmitter0.end_class();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.visit(2, 2, ", ,9", ", ,9", ", ,9", (String[]) null);
      classEmitter0.begin_static();
      classEmitter0.visitEnd();
  }
}
