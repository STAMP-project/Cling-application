/*

 * Tue Mar 03 14:14:39 GMT 2020
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
public class InterceptFieldTransformer_ESTest extends InterceptFieldTransformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[9];
      ClassWriter classWriter0 = new ClassWriter(2339);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.visit(9, 34, "getInerceptFieldCallback", stringArray0[6], stringArray0[7], stringArray0);
      classEmitter0.getStaticHook();
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(157);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.begin_class(2, 10, "9L,@pbI]O3", (Type) null, (Type[]) null, "9L,@pbI]O3");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      // Undeclared exception!
      try { 
        classEmitter0.begin_static();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // classInfo is null! org.mockito.cglib.core.ClassEmitter@1783a0bb
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2339);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.end_class();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[8];
      ClassWriter classWriter0 = new ClassWriter(169);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.visit(9, (-3481), "getInterceptFieldCallback", stringArray0[6], stringArray0[7], stringArray0);
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
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[8];
      ClassWriter classWriter0 = new ClassWriter(169);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.visit(9, (-3481), "getInterceptFieldCallback", stringArray0[6], stringArray0[7], stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      ClassEmitter classEmitter0 = new ClassEmitter(classAdapter0);
      String[] stringArray0 = new String[14];
      classEmitter0.visit(7, 1, "[g^dGr'7O;&TDL", "'<#h3kq=X7]", "'<#h3kq=X7]", stringArray0);
      classEmitter0.begin_static();
      classEmitter0.end_class();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String[] stringArray0 = new String[9];
      ClassWriter classWriter0 = new ClassWriter(2339);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.visit(9, 34, "getInerceptFieldCallback", stringArray0[6], stringArray0[7], stringArray0);
      classEmitter0.getStaticHook();
      classEmitter0.end_class();
  }
}
