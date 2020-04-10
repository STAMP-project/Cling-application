/*

 * Tue Mar 03 14:21:54 GMT 2020
 */

package org.mockito.cglib.proxy;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.ClassVisitor;
import org.mockito.cglib.proxy.Enhancer;
import org.mockito.internal.creation.MethodInterceptorFilter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Enhancer_ESTest extends Enhancer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<InputStream> class0 = InputStream.class;
      Enhancer enhancer0 = new Enhancer();
      enhancer0.setSuperclass(class0);
      try { 
        enhancer0.generateClass((ClassVisitor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.AbstractClassGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Enhancer enhancer0 = new Enhancer();
      Class<MethodInterceptorFilter> class0 = MethodInterceptorFilter.class;
      enhancer0.setCallbackType(class0);
      // Undeclared exception!
      try { 
        enhancer0.createClass();
        fail("Expecting exception: IncompatibleClassChangeError");
      
      } catch(IncompatibleClassChangeError e) {
         //
         // Expected non-static field org.mockito.cglib.proxy.Enhancer.serialVersionUID
         //
         verifyException("org.mockito.cglib.proxy.Enhancer", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      Enhancer enhancer0 = new Enhancer();
      try { 
        enhancer0.generateClass((ClassVisitor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.AbstractClassGenerator", e);
      }
  }
}
