/*

 * Tue Mar 03 14:18:16 GMT 2020
 */

package org.mockito.cglib.transform.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.ClassWriter;
import org.mockito.cglib.core.ClassEmitter;
import org.mockito.cglib.core.CodeEmitter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class InterceptFieldTransformer_ESTest extends InterceptFieldTransformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      // Undeclared exception!
      try { 
        classEmitter0.begin_static();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // classInfo is null! org.mockito.cglib.core.ClassEmitter@70eb639d
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      // Undeclared exception!
      try { 
        classEmitter0.end_class();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[4];
      ClassWriter classWriter0 = new ClassWriter(6);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.visit(1, 0, "", "fyL\"[W=1;N)", "", stringArray0);
      classEmitter0.begin_static();
      classEmitter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      ClassWriter classWriter0 = new ClassWriter(2147483612);
      classEmitter0.setTarget(classWriter0);
      String[] stringArray0 = new String[8];
      classEmitter0.visit(24, 2147483612, "", "", (String) null, stringArray0);
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
      ClassEmitter classEmitter0 = new ClassEmitter();
      ClassWriter classWriter0 = new ClassWriter((-1));
      classEmitter0.setTarget(classWriter0);
      String[] stringArray0 = new String[8];
      classEmitter0.visit(1, (-1), "", "", (String) null, stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[4];
      ClassWriter classWriter0 = new ClassWriter(6);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.visit(1, 0, "@<KS2%I&d+kSwS0J", "", "@<KS2%I&d+kSwS0J", stringArray0);
      classEmitter0.begin_static();
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      ClassWriter classWriter0 = new ClassWriter(2147483612);
      classEmitter0.setTarget(classWriter0);
      String[] stringArray0 = new String[8];
      classEmitter0.visit(1, 1, "", "", (String) null, stringArray0);
      classEmitter0.getStaticHook();
      classEmitter0.end_class();
  }
}
