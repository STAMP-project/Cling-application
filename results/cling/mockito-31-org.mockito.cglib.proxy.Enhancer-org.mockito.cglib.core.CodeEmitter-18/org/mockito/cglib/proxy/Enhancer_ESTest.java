/*

 * Tue Mar 03 14:21:35 GMT 2020
 */

package org.mockito.cglib.proxy;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.asm.ClassVisitor;
import org.mockito.cglib.proxy.Enhancer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Enhancer_ESTest extends Enhancer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassVisitor classVisitor0 = mock(ClassVisitor.class, new ViolatedAssumptionAnswer());
      Enhancer enhancer0 = new Enhancer();
      // Undeclared exception!
      try { 
        enhancer0.nextInstance(classVisitor0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class org.mockito.asm.ClassVisitor$MockitoMock$1727469380 is not an enhanced class
         //
         verifyException("org.mockito.cglib.proxy.Enhancer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Enhancer enhancer0 = new Enhancer();
      Class<String> class0 = String.class;
      enhancer0.setSuperclass(class0);
      ClassVisitor classVisitor0 = mock(ClassVisitor.class, new ViolatedAssumptionAnswer());
      try { 
        enhancer0.generateClass(classVisitor0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot subclass final class class java.lang.String
         //
         verifyException("org.mockito.cglib.proxy.Enhancer", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      Enhancer enhancer0 = new Enhancer();
      ClassVisitor classVisitor0 = mock(ClassVisitor.class, new ViolatedAssumptionAnswer());
      try { 
        enhancer0.generateClass(classVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.AbstractClassGenerator", e);
      }
  }
}
