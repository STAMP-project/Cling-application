/*

 * Tue Mar 03 14:16:01 GMT 2020
 */

package org.mockito.cglib.transform.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Type;
import org.mockito.cglib.core.ClassEmitter;
import org.mockito.cglib.core.CodeEmitter;
import org.mockito.cglib.transform.impl.InterceptFieldFilter;
import org.mockito.cglib.transform.impl.InterceptFieldTransformer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class InterceptFieldTransformer_ESTest extends InterceptFieldTransformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InterceptFieldFilter interceptFieldFilter0 = mock(InterceptFieldFilter.class, new ViolatedAssumptionAnswer());
      InterceptFieldTransformer interceptFieldTransformer0 = new InterceptFieldTransformer(interceptFieldFilter0);
      String[] stringArray0 = new String[6];
      ClassWriter classWriter0 = new ClassWriter(180);
      interceptFieldTransformer0.setTarget(classWriter0);
      interceptFieldTransformer0.visit(180, 180, "voiz", "dzP", "voiz", stringArray0);
      interceptFieldTransformer0.getStaticHook();
      CodeEmitter codeEmitter0 = interceptFieldTransformer0.getStaticHook();
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Type type0 = Type.getObjectType("PeN0");
      ClassWriter classWriter0 = new ClassWriter((-283));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type[] typeArray0 = new Type[4];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      classEmitter0.begin_class((-1265), 10, "PeN0", type0, typeArray0, "gpe/p9Td?SnAW^95)w ");
      assertEquals(1, Type.BOOLEAN);
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
         // classInfo is null! org.mockito.cglib.core.ClassEmitter@1a6f050c
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      InterceptFieldFilter interceptFieldFilter0 = mock(InterceptFieldFilter.class, new ViolatedAssumptionAnswer());
      InterceptFieldTransformer interceptFieldTransformer0 = new InterceptFieldTransformer(interceptFieldFilter0);
      // Undeclared exception!
      try { 
        interceptFieldTransformer0.end_class();
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
      InterceptFieldFilter interceptFieldFilter0 = mock(InterceptFieldFilter.class, new ViolatedAssumptionAnswer());
      InterceptFieldTransformer interceptFieldTransformer0 = new InterceptFieldTransformer(interceptFieldFilter0);
      String[] stringArray0 = new String[6];
      ClassWriter classWriter0 = new ClassWriter(180);
      interceptFieldTransformer0.setTarget(classWriter0);
      interceptFieldTransformer0.visit(10, 2147483645, "dzP", "dzP", "voiz", stringArray0);
      // Undeclared exception!
      try { 
        interceptFieldTransformer0.getStaticHook();
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
      InterceptFieldFilter interceptFieldFilter0 = mock(InterceptFieldFilter.class, new ViolatedAssumptionAnswer());
      InterceptFieldTransformer interceptFieldTransformer0 = new InterceptFieldTransformer(interceptFieldFilter0);
      String[] stringArray0 = new String[6];
      ClassWriter classWriter0 = new ClassWriter(180);
      interceptFieldTransformer0.setTarget(classWriter0);
      interceptFieldTransformer0.visit(10, 2147483645, "dzP", "dzP", "voiz", stringArray0);
      CodeEmitter codeEmitter0 = interceptFieldTransformer0.begin_static();
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      InterceptFieldFilter interceptFieldFilter0 = mock(InterceptFieldFilter.class, new ViolatedAssumptionAnswer());
      InterceptFieldTransformer interceptFieldTransformer0 = new InterceptFieldTransformer(interceptFieldFilter0);
      String[] stringArray0 = new String[6];
      ClassWriter classWriter0 = new ClassWriter(180);
      interceptFieldTransformer0.setTarget(classWriter0);
      interceptFieldTransformer0.visit(180, 180, "voiz", "", "voiz", stringArray0);
      interceptFieldTransformer0.begin_static();
      interceptFieldTransformer0.end_class();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      InterceptFieldFilter interceptFieldFilter0 = mock(InterceptFieldFilter.class, new ViolatedAssumptionAnswer());
      InterceptFieldTransformer interceptFieldTransformer0 = new InterceptFieldTransformer(interceptFieldFilter0);
      String[] stringArray0 = new String[6];
      ClassWriter classWriter0 = new ClassWriter(180);
      interceptFieldTransformer0.setTarget(classWriter0);
      interceptFieldTransformer0.visit(180, 180, "voiz", "", "voiz", stringArray0);
      interceptFieldTransformer0.getStaticHook();
      interceptFieldTransformer0.end_class();
  }
}
