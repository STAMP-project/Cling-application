/*

 * Tue Mar 03 14:04:22 GMT 2020
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
      ClassWriter classWriter0 = new ClassWriter(9);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      ClassEmitter classEmitter0 = new ClassEmitter(classAdapter0);
      String[] stringArray0 = new String[5];
      classEmitter0.visit(5, (-326), "[sb},;iP:", "Mlt^RaA3Qn!eR0H#Y", "Mlt^RaA3Qn!eR0H#Y", stringArray0);
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
      ClassWriter classWriter0 = new ClassWriter(9);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      ClassEmitter classEmitter0 = new ClassEmitter(classAdapter0);
      String[] stringArray0 = new String[5];
      classEmitter0.visit(5, 1, "[sb},;iP:", "!Lz", "!Lz", stringArray0);
      classEmitter0.begin_static();
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      assertEquals(128, CodeEmitter.OR);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(92);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.begin_class(92, 104, "", (Type) null, (Type[]) null, "#,_23hL2;)91Ir//Hyb");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(9);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      ClassEmitter classEmitter0 = new ClassEmitter(classAdapter0);
      classEmitter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(9);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      ClassEmitter classEmitter0 = new ClassEmitter(classAdapter0);
      String[] stringArray0 = new String[5];
      classEmitter0.visit(2, 185, "[sb},;iP:", "An>5v=ndp%", "An>5v=ndp%", stringArray0);
      classEmitter0.getStaticHook();
      classEmitter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(9);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      ClassEmitter classEmitter0 = new ClassEmitter(classAdapter0);
      String[] stringArray0 = new String[5];
      classEmitter0.visit(2, 185, "[sb},;iP:", "An>5v=ndp%", "An>5v=ndp%", stringArray0);
      classEmitter0.begin_static();
      classEmitter0.end_class();
  }
}
