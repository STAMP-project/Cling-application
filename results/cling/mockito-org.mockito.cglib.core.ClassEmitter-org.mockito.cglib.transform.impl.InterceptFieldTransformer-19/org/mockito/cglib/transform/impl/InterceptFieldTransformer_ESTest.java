/*

 * Tue Mar 03 14:16:28 GMT 2020
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
      ClassWriter classWriter0 = new ClassWriter(4);
      interceptFieldTransformer0.setTarget(classWriter0);
      String[] stringArray0 = new String[5];
      interceptFieldTransformer0.visit(2, 9, "Ts9-hgg%uh8YQE|", "Ts9-hgg%uh8YQE|", "Ts9-hgg%uh8YQE|", stringArray0);
      CodeEmitter codeEmitter0 = interceptFieldTransformer0.getStaticHook();
      CodeEmitter codeEmitter1 = interceptFieldTransformer0.getStaticHook();
      assertSame(codeEmitter1, codeEmitter0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InterceptFieldFilter interceptFieldFilter0 = mock(InterceptFieldFilter.class, new ViolatedAssumptionAnswer());
      InterceptFieldTransformer interceptFieldTransformer0 = new InterceptFieldTransformer(interceptFieldFilter0);
      ClassWriter classWriter0 = new ClassWriter(4);
      interceptFieldTransformer0.setTarget(classWriter0);
      String[] stringArray0 = new String[5];
      interceptFieldTransformer0.visit(2, 9, "Ts9-hgg%uh8YQE|", "Ts9-hgg%uh8YQE|", "Ts9-hgg%uh8YQE|", stringArray0);
      Type type0 = interceptFieldTransformer0.getClassType();
      Type[] typeArray0 = new Type[0];
      interceptFieldTransformer0.begin_class(8, 2, "", type0, typeArray0, "\"!niMr2}\"_A");
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
         // classInfo is null! org.mockito.cglib.core.ClassEmitter@1ca0925e
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
        interceptFieldTransformer0.visitEnd();
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
      ClassWriter classWriter0 = new ClassWriter(4);
      interceptFieldTransformer0.setTarget(classWriter0);
      String[] stringArray0 = new String[5];
      interceptFieldTransformer0.visit(4998, (-2269), "-j;", "-j;", "-j;", stringArray0);
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
      ClassWriter classWriter0 = new ClassWriter(4);
      interceptFieldTransformer0.setTarget(classWriter0);
      String[] stringArray0 = new String[5];
      interceptFieldTransformer0.visit(4998, (-2269), "-j;", "-j;", "-j;", stringArray0);
      CodeEmitter codeEmitter0 = interceptFieldTransformer0.begin_static();
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      InterceptFieldFilter interceptFieldFilter0 = mock(InterceptFieldFilter.class, new ViolatedAssumptionAnswer());
      InterceptFieldTransformer interceptFieldTransformer0 = new InterceptFieldTransformer(interceptFieldFilter0);
      ClassWriter classWriter0 = new ClassWriter(4);
      interceptFieldTransformer0.setTarget(classWriter0);
      String[] stringArray0 = new String[5];
      interceptFieldTransformer0.visit(2, 3331, "Ts9-hgg%uh8YQE|", "Ts9-hgg%uh8YQE|", "Ts9-hgg%uh8YQE|", stringArray0);
      interceptFieldTransformer0.begin_static();
      interceptFieldTransformer0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      InterceptFieldFilter interceptFieldFilter0 = mock(InterceptFieldFilter.class, new ViolatedAssumptionAnswer());
      InterceptFieldTransformer interceptFieldTransformer0 = new InterceptFieldTransformer(interceptFieldFilter0);
      ClassWriter classWriter0 = new ClassWriter(4);
      interceptFieldTransformer0.setTarget(classWriter0);
      String[] stringArray0 = new String[5];
      interceptFieldTransformer0.visit(2, 3331, "Ts9-hgg%uh8YQE|", "Ts9-hgg%uh8YQE|", "Ts9-hgg%uh8YQE|", stringArray0);
      interceptFieldTransformer0.getStaticHook();
      interceptFieldTransformer0.end_class();
  }
}
