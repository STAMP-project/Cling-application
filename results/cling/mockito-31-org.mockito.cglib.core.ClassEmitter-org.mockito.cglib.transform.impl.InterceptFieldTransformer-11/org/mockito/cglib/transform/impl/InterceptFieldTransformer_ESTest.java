/*

 * Tue Mar 03 14:15:01 GMT 2020
 */

package org.mockito.cglib.transform.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Type;
import org.mockito.cglib.core.ClassEmitter;
import org.mockito.cglib.core.CodeEmitter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class InterceptFieldTransformer_ESTest extends InterceptFieldTransformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(105);
      ClassEmitter classEmitter0 = new ClassEmitter();
      String[] stringArray0 = new String[1];
      classEmitter0.setTarget(classWriter0);
      classEmitter0.visit(1, 1, "3", "_", "", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      CodeEmitter codeEmitter1 = classEmitter0.getStaticHook();
      assertSame(codeEmitter1, codeEmitter0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2237);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      // Undeclared exception!
      try { 
        classEmitter0.begin_static();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // classInfo is null! org.mockito.cglib.core.ClassEmitter@50a2478b
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2237);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2394));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(1, (-2394), "I\"", "I\"", "I\"", stringArray0);
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
  public void test4()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2237);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type[] typeArray0 = new Type[0];
      classEmitter0.begin_class(94, 796, "RuntimeInvisibleParameterAnnotations", (Type) null, typeArray0, "");
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2237);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[2];
      classEmitter0.visit(1, 2237, "I\"", "", "I\"", stringArray0);
      classEmitter0.begin_static();
      classEmitter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(105);
      ClassEmitter classEmitter0 = new ClassEmitter();
      String[] stringArray0 = new String[1];
      classEmitter0.setTarget(classWriter0);
      classEmitter0.visit(1, 1, "", "Signature", "", stringArray0);
      classEmitter0.getStaticHook();
      classEmitter0.end_class();
  }
}
