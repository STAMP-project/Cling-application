/*

 * Tue Mar 03 14:17:47 GMT 2020
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
      ClassWriter classWriter0 = new ClassWriter(87);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[10];
      classEmitter0.visit(1, 104, "^Hn1KF/U npVF=", "^Hn1KF/U npVF=", "^Hn1KF/U npVF=", stringArray0);
      classEmitter0.getStaticHook();
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(177);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Class<String> class0 = String.class;
      Type type0 = Type.getType(class0);
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      classEmitter0.begin_class(2053, (-2716), "o~Op TV}lC_}}.E&", type0, typeArray0, "i#Q");
      assertEquals(6, Type.FLOAT);
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
         // classInfo is null! org.mockito.cglib.core.ClassEmitter@4cb7ec35
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
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
  public void test4()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(130);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit((-278), 590, "h+a+cPyV$%2UUx4c", "h+a+cPyV$%2UUx4c", "", stringArray0);
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
      ClassWriter classWriter0 = new ClassWriter(87);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(7, 104, "`TOb>97dGesl,A", "`TOb>97dGesl,A", "kuy95bW-YI9+A8", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(87);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[10];
      classEmitter0.visit(1, 104, "^Hn1KF/U npVF=", "^Hn1KF/U npVF=", "^Hn1KF/U npVF=", stringArray0);
      classEmitter0.getStaticHook();
      classEmitter0.visitEnd();
  }
}
