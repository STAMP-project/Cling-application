/*

 * Tue Mar 03 14:01:56 GMT 2020
 */

package org.mockito.cglib.proxy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataInputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.cglib.proxy.Callback;
import org.mockito.cglib.proxy.Enhancer;
import org.mockito.internal.MockHandler;
import org.mockito.internal.MockitoInvocationHandler;
import org.mockito.internal.creation.MethodInterceptorFilter;
import org.mockito.internal.creation.MockSettingsImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Enhancer_ESTest extends Enhancer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Enhancer enhancer0 = new Enhancer();
      MockHandler<Method> mockHandler0 = new MockHandler<Method>((MockSettingsImpl) null);
      MethodInterceptorFilter methodInterceptorFilter0 = new MethodInterceptorFilter(mockHandler0, (MockSettingsImpl) null);
      Callback[] callbackArray0 = new Callback[2];
      callbackArray0[0] = (Callback) methodInterceptorFilter0;
      callbackArray0[1] = (Callback) methodInterceptorFilter0;
      enhancer0.setCallbacks(callbackArray0);
      Class<Object> class0 = Object.class;
      enhancer0.setSuperclass(class0);
      // Undeclared exception!
      try { 
        enhancer0.create();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Multiple callback types possible but no filter specified
         //
         verifyException("org.mockito.cglib.proxy.Enhancer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Enhancer enhancer0 = new Enhancer();
      Class<MethodInterceptorFilter> class0 = MethodInterceptorFilter.class;
      enhancer0.setCallbackType(class0);
      LinkedList<Method> linkedList0 = new LinkedList<Method>();
      // Undeclared exception!
      try { 
        enhancer0.filterConstructors(class0, linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No visible constructors in class org.mockito.internal.creation.MethodInterceptorFilter
         //
         verifyException("org.mockito.cglib.proxy.Enhancer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Enhancer enhancer0 = new Enhancer();
      // Undeclared exception!
      try { 
        enhancer0.create((Class[]) null, (Object[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Arguments must be non-null and of equal length
         //
         verifyException("org.mockito.cglib.proxy.Enhancer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Enhancer enhancer0 = new Enhancer();
      Class<MethodInterceptorFilter> class0 = MethodInterceptorFilter.class;
      enhancer0.setCallbackType(class0);
      enhancer0.setCallbacks((Callback[]) null);
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
  public void test04()  throws Throwable  {
      Callback callback0 = mock(Callback.class, new ViolatedAssumptionAnswer());
      Enhancer enhancer0 = new Enhancer();
      enhancer0.setCallback(callback0);
      LinkedList<Method> linkedList0 = new LinkedList<Method>();
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        enhancer0.filterConstructors(class0, linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No visible constructors in class java.lang.String
         //
         verifyException("org.mockito.cglib.proxy.Enhancer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
      MockHandler<String> mockHandler0 = new MockHandler<String>(mockSettingsImpl0);
      MethodInterceptorFilter methodInterceptorFilter0 = new MethodInterceptorFilter(mockHandler0, mockSettingsImpl0);
      // Undeclared exception!
      try { 
        Enhancer.create((Class) null, (Callback) methodInterceptorFilter0);
        fail("Expecting exception: IncompatibleClassChangeError");
      
      } catch(IncompatibleClassChangeError e) {
         //
         // Expected non-static field org.mockito.cglib.proxy.Enhancer.serialVersionUID
         //
         verifyException("org.mockito.cglib.proxy.Enhancer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Enhancer enhancer0 = new Enhancer();
      enhancer0.setSuperclass(class0);
      Class<String> class1 = String.class;
      LinkedList<Method> linkedList0 = new LinkedList<Method>();
      // Undeclared exception!
      try { 
        enhancer0.filterConstructors(class1, linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No visible constructors in class java.lang.String
         //
         verifyException("org.mockito.cglib.proxy.Enhancer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Enhancer enhancer0 = new Enhancer();
      Class<Method> class0 = Method.class;
      enhancer0.setSuperclass(class0);
      LinkedList<MethodInterceptorFilter> linkedList0 = new LinkedList<MethodInterceptorFilter>();
      // Undeclared exception!
      try { 
        enhancer0.filterConstructors(class0, linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No visible constructors in class java.lang.reflect.Method
         //
         verifyException("org.mockito.cglib.proxy.Enhancer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Enhancer enhancer0 = new Enhancer();
      Class<MethodInterceptorFilter> class0 = MethodInterceptorFilter.class;
      MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
      MockHandler<Method> mockHandler0 = new MockHandler<Method>(mockSettingsImpl0);
      MethodInterceptorFilter methodInterceptorFilter0 = new MethodInterceptorFilter(mockHandler0, mockSettingsImpl0);
      Callback[] callbackArray0 = new Callback[2];
      callbackArray0[0] = (Callback) methodInterceptorFilter0;
      callbackArray0[1] = (Callback) methodInterceptorFilter0;
      enhancer0.setCallbacks(callbackArray0);
      enhancer0.setSuperclass(class0);
      // Undeclared exception!
      try { 
        enhancer0.create();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Multiple callback types possible but no filter specified
         //
         verifyException("org.mockito.cglib.proxy.Enhancer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Enhancer enhancer0 = new Enhancer();
      MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
      MockHandler<Method> mockHandler0 = new MockHandler<Method>(mockSettingsImpl0);
      MethodInterceptorFilter methodInterceptorFilter0 = new MethodInterceptorFilter(mockHandler0, mockSettingsImpl0);
      Callback[] callbackArray0 = new Callback[2];
      callbackArray0[0] = (Callback) methodInterceptorFilter0;
      callbackArray0[1] = (Callback) methodInterceptorFilter0;
      enhancer0.setCallbacks(callbackArray0);
      enhancer0.setSuperclass((Class) null);
      // Undeclared exception!
      try { 
        enhancer0.create();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Multiple callback types possible but no filter specified
         //
         verifyException("org.mockito.cglib.proxy.Enhancer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 2);
      Enhancer enhancer0 = new Enhancer();
      // Undeclared exception!
      try { 
        enhancer0.create((Class[]) classArray0, (Object[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Arguments must be non-null and of equal length
         //
         verifyException("org.mockito.cglib.proxy.Enhancer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Enhancer enhancer0 = new Enhancer();
      // Undeclared exception!
      try { 
        enhancer0.setCallbackTypes((Class[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.proxy.CallbackInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
      MockHandler<Method> mockHandler0 = new MockHandler<Method>(mockSettingsImpl0);
      MethodInterceptorFilter methodInterceptorFilter0 = new MethodInterceptorFilter(mockHandler0, mockSettingsImpl0);
      // Undeclared exception!
      try { 
        Enhancer.create((Class) class0, (Callback) methodInterceptorFilter0);
        fail("Expecting exception: IncompatibleClassChangeError");
      
      } catch(IncompatibleClassChangeError e) {
         //
         // Expected non-static field org.mockito.cglib.proxy.Enhancer.serialVersionUID
         //
         verifyException("org.mockito.cglib.proxy.Enhancer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
      MethodInterceptorFilter methodInterceptorFilter0 = new MethodInterceptorFilter((MockitoInvocationHandler) null, mockSettingsImpl0);
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        Enhancer.create((Class) class0, (Callback) methodInterceptorFilter0);
        fail("Expecting exception: IncompatibleClassChangeError");
      
      } catch(IncompatibleClassChangeError e) {
         //
         // Expected non-static field org.mockito.cglib.proxy.Enhancer.serialVersionUID
         //
         verifyException("org.mockito.cglib.proxy.Enhancer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Enhancer enhancer0 = new Enhancer();
      enhancer0.setCallbacks((Callback[]) null);
      LinkedList<Method> linkedList0 = new LinkedList<Method>();
      Class<Enhancer> class0 = Enhancer.class;
      // Undeclared exception!
      try { 
        enhancer0.filterConstructors(class0, linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No visible constructors in class org.mockito.cglib.proxy.Enhancer
         //
         verifyException("org.mockito.cglib.proxy.Enhancer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Enhancer enhancer0 = new Enhancer();
      Class<DataInputStream>[] classArray0 = (Class<DataInputStream>[]) Array.newInstance(Class.class, 1);
      Callback[] callbackArray0 = new Callback[2];
      MockHandler<Method> mockHandler0 = new MockHandler<Method>((MockSettingsImpl) null);
      MethodInterceptorFilter methodInterceptorFilter0 = new MethodInterceptorFilter(mockHandler0, (MockSettingsImpl) null);
      callbackArray0[0] = (Callback) methodInterceptorFilter0;
      callbackArray0[1] = (Callback) methodInterceptorFilter0;
      enhancer0.setCallbacks(callbackArray0);
      // Undeclared exception!
      try { 
        enhancer0.create((Class[]) classArray0, (Object[]) classArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Multiple callback types possible but no filter specified
         //
         verifyException("org.mockito.cglib.proxy.Enhancer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<MethodInterceptorFilter> class0 = MethodInterceptorFilter.class;
      Enhancer enhancer0 = new Enhancer();
      Class<MethodInterceptorFilter>[] classArray0 = (Class<MethodInterceptorFilter>[]) Array.newInstance(Class.class, 3);
      classArray0[0] = class0;
      classArray0[1] = class0;
      classArray0[2] = class0;
      enhancer0.setCallbackTypes(classArray0);
      // Undeclared exception!
      try { 
        enhancer0.createClass();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Multiple callback types possible but no filter specified
         //
         verifyException("org.mockito.cglib.proxy.Enhancer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 0);
      Enhancer enhancer0 = new Enhancer();
      MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
      MockHandler<Method> mockHandler0 = new MockHandler<Method>(mockSettingsImpl0);
      MethodInterceptorFilter methodInterceptorFilter0 = new MethodInterceptorFilter(mockHandler0, mockSettingsImpl0);
      enhancer0.setCallback(methodInterceptorFilter0);
      // Undeclared exception!
      try { 
        enhancer0.create((Class[]) classArray0, (Object[]) classArray0);
        fail("Expecting exception: IncompatibleClassChangeError");
      
      } catch(IncompatibleClassChangeError e) {
         //
         // Expected non-static field org.mockito.cglib.proxy.Enhancer.serialVersionUID
         //
         verifyException("org.mockito.cglib.proxy.Enhancer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 4);
      Enhancer enhancer0 = new Enhancer();
      // Undeclared exception!
      try { 
        enhancer0.create((Class[]) classArray0, (Object[]) classArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Callbacks are required
         //
         verifyException("org.mockito.cglib.proxy.Enhancer", e);
      }
  }
}
