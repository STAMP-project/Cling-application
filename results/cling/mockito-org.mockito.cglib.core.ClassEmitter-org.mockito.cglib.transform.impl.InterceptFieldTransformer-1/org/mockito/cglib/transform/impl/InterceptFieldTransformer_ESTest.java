/*

 * Tue Mar 03 14:11:58 GMT 2020
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
      ClassWriter classWriter0 = new ClassWriter((-1078));
      interceptFieldTransformer0.setTarget(classWriter0);
      interceptFieldTransformer0.visit(1, 1, "", "D?;XR", "", (String[]) null);
      interceptFieldTransformer0.begin_static();
      CodeEmitter codeEmitter0 = interceptFieldTransformer0.getStaticHook();
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Type type0 = Type.getObjectType(";JV;z5ugHX-YG");
      ClassWriter classWriter0 = new ClassWriter(10);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type[] typeArray0 = new Type[0];
      classEmitter0.begin_class(10, 1, ";JV;z5ugHX-YG", type0, typeArray0, ";JV;z5ugHX-YG");
      assertEquals(7, Type.LONG);
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
         // classInfo is null! org.mockito.cglib.core.ClassEmitter@45e9f9f8
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
      ClassWriter classWriter0 = new ClassWriter((-1078));
      interceptFieldTransformer0.setTarget(classWriter0);
      interceptFieldTransformer0.visit((-2131), (-2131), "", "|,Hz]3>kR/:2WL", "[-7GDRGT9'", (String[]) null);
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
      ClassWriter classWriter0 = new ClassWriter((-1078));
      interceptFieldTransformer0.setTarget(classWriter0);
      interceptFieldTransformer0.visit((-2131), (-2131), "", "|,Hz]3>kR/:2WL", "[-7GDRGT9'", (String[]) null);
      CodeEmitter codeEmitter0 = interceptFieldTransformer0.begin_static();
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      InterceptFieldFilter interceptFieldFilter0 = mock(InterceptFieldFilter.class, new ViolatedAssumptionAnswer());
      InterceptFieldTransformer interceptFieldTransformer0 = new InterceptFieldTransformer(interceptFieldFilter0);
      ClassWriter classWriter0 = new ClassWriter((-1078));
      interceptFieldTransformer0.setTarget(classWriter0);
      interceptFieldTransformer0.visit(1, 1, "", "", "", (String[]) null);
      interceptFieldTransformer0.begin_static();
      interceptFieldTransformer0.end_class();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      InterceptFieldFilter interceptFieldFilter0 = mock(InterceptFieldFilter.class, new ViolatedAssumptionAnswer());
      InterceptFieldTransformer interceptFieldTransformer0 = new InterceptFieldTransformer(interceptFieldFilter0);
      ClassWriter classWriter0 = new ClassWriter((-1078));
      interceptFieldTransformer0.setTarget(classWriter0);
      interceptFieldTransformer0.visit(1, 1, "", "", "", (String[]) null);
      interceptFieldTransformer0.getStaticHook();
      interceptFieldTransformer0.end_class();
  }
}
