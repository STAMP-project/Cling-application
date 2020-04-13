/*

 * Tue Mar 03 14:02:01 GMT 2020
 */

package org.mockito.cglib.proxy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.cglib.proxy.Callback;
import org.mockito.cglib.proxy.CallbackFilter;
import org.mockito.cglib.proxy.Enhancer;
import org.mockito.internal.MockHandler;
import org.mockito.internal.creation.MethodInterceptorFilter;
import org.mockito.internal.creation.MockSettingsImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Enhancer_ESTest extends Enhancer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
      MockHandler<Enhancer> mockHandler0 = new MockHandler<Enhancer>(mockSettingsImpl0);
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
  public void test01()  throws Throwable  {
      MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
      Enhancer enhancer0 = new Enhancer();
      enhancer0.setCallbacks((Callback[]) null);
      Class<Object> class0 = Object.class;
      MockHandler<Enhancer> mockHandler0 = new MockHandler<Enhancer>(mockSettingsImpl0);
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
  public void test02()  throws Throwable  {
      Enhancer enhancer0 = new Enhancer();
      Class<MethodInterceptorFilter> class0 = MethodInterceptorFilter.class;
      enhancer0.setCallbackType(class0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
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
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
      Enhancer enhancer0 = new Enhancer();
      enhancer0.setCallback((Callback) null);
      LinkedList<Method> linkedList0 = new LinkedList<Method>();
      Class<Method> class0 = Method.class;
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
  public void test05()  throws Throwable  {
      Enhancer enhancer0 = new Enhancer();
      enhancer0.setCallbacks((Callback[]) null);
      LinkedList<Method> linkedList0 = new LinkedList<Method>();
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        enhancer0.filterConstructors(class0, linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No visible constructors in class java.lang.Integer
         //
         verifyException("org.mockito.cglib.proxy.Enhancer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockHandler<Enhancer> mockHandler0 = new MockHandler<Enhancer>((MockSettingsImpl) null);
      MethodInterceptorFilter methodInterceptorFilter0 = new MethodInterceptorFilter(mockHandler0, (MockSettingsImpl) null);
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
  public void test07()  throws Throwable  {
      Enhancer enhancer0 = new Enhancer();
      Class<Object> class0 = Object.class;
      enhancer0.setSuperclass(class0);
      LinkedList<Method> linkedList0 = new LinkedList<Method>();
      // Undeclared exception!
      try { 
        enhancer0.filterConstructors(class0, linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No visible constructors in class java.lang.Object
         //
         verifyException("org.mockito.cglib.proxy.Enhancer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Enhancer enhancer0 = new Enhancer();
      Class<Locale.LanguageRange> class0 = Locale.LanguageRange.class;
      enhancer0.setSuperclass(class0);
      LinkedList<Method> linkedList0 = new LinkedList<Method>();
      // Undeclared exception!
      try { 
        enhancer0.filterConstructors(class0, linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No visible constructors in class java.util.Locale$LanguageRange
         //
         verifyException("org.mockito.cglib.proxy.Enhancer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Enhancer enhancer0 = new Enhancer();
      enhancer0.setSuperclass((Class) null);
      MockHandler<Enhancer> mockHandler0 = new MockHandler<Enhancer>((MockSettingsImpl) null);
      MethodInterceptorFilter methodInterceptorFilter0 = new MethodInterceptorFilter(mockHandler0, (MockSettingsImpl) null);
      Callback[] callbackArray0 = new Callback[3];
      callbackArray0[0] = (Callback) methodInterceptorFilter0;
      callbackArray0[1] = (Callback) methodInterceptorFilter0;
      callbackArray0[2] = (Callback) methodInterceptorFilter0;
      enhancer0.setCallbacks(callbackArray0);
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
      Enhancer enhancer0 = new Enhancer();
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 1);
      // Undeclared exception!
      try { 
        enhancer0.create(classArray0, (Object[]) null);
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
      Enhancer enhancer0 = new Enhancer();
      Class<Object> class0 = Object.class;
      enhancer0.setSuperclass(class0);
      Callback[] callbackArray0 = new Callback[3];
      MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
      MockHandler<Enhancer> mockHandler0 = new MockHandler<Enhancer>(mockSettingsImpl0);
      MethodInterceptorFilter methodInterceptorFilter0 = new MethodInterceptorFilter(mockHandler0, mockSettingsImpl0);
      callbackArray0[0] = (Callback) methodInterceptorFilter0;
      callbackArray0[1] = (Callback) methodInterceptorFilter0;
      callbackArray0[2] = (Callback) methodInterceptorFilter0;
      enhancer0.setCallbacks(callbackArray0);
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
  public void test13()  throws Throwable  {
      Enhancer enhancer0 = new Enhancer();
      MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
      MockHandler<String> mockHandler0 = new MockHandler<String>(mockSettingsImpl0);
      MethodInterceptorFilter methodInterceptorFilter0 = new MethodInterceptorFilter(mockHandler0, mockSettingsImpl0);
      enhancer0.setCallback(methodInterceptorFilter0);
      Class<Method>[] classArray0 = (Class<Method>[]) Array.newInstance(Class.class, 2);
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
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
      Enhancer enhancer0 = new Enhancer();
      enhancer0.setCallbacks((Callback[]) null);
      Class<MethodInterceptorFilter> class0 = MethodInterceptorFilter.class;
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 7);
      Callback[] callbackArray0 = new Callback[9];
      MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
      MockHandler<Enhancer> mockHandler0 = new MockHandler<Enhancer>(mockSettingsImpl0);
      MethodInterceptorFilter methodInterceptorFilter0 = new MethodInterceptorFilter(mockHandler0, mockSettingsImpl0);
      callbackArray0[0] = (Callback) methodInterceptorFilter0;
      callbackArray0[1] = (Callback) methodInterceptorFilter0;
      callbackArray0[2] = (Callback) methodInterceptorFilter0;
      callbackArray0[3] = (Callback) methodInterceptorFilter0;
      callbackArray0[4] = (Callback) methodInterceptorFilter0;
      callbackArray0[5] = (Callback) methodInterceptorFilter0;
      callbackArray0[6] = (Callback) methodInterceptorFilter0;
      callbackArray0[7] = (Callback) methodInterceptorFilter0;
      callbackArray0[8] = (Callback) methodInterceptorFilter0;
      // Undeclared exception!
      try { 
        Enhancer.create(class0, classArray0, (CallbackFilter) null, callbackArray0);
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
      Enhancer enhancer0 = new Enhancer();
      Class<MethodInterceptorFilter>[] classArray0 = (Class<MethodInterceptorFilter>[]) Array.newInstance(Class.class, 3);
      Class<MethodInterceptorFilter> class0 = MethodInterceptorFilter.class;
      classArray0[0] = class0;
      classArray0[1] = classArray0[0];
      classArray0[2] = classArray0[1];
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
      Enhancer enhancer0 = new Enhancer();
      MockHandler<String> mockHandler0 = new MockHandler<String>((MockSettingsImpl) null);
      MethodInterceptorFilter methodInterceptorFilter0 = new MethodInterceptorFilter(mockHandler0, (MockSettingsImpl) null);
      Callback[] callbackArray0 = new Callback[2];
      callbackArray0[0] = (Callback) methodInterceptorFilter0;
      callbackArray0[1] = (Callback) methodInterceptorFilter0;
      enhancer0.setCallbacks(callbackArray0);
      Class<InputStream>[] classArray0 = (Class<InputStream>[]) Array.newInstance(Class.class, 0);
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
  public void test18()  throws Throwable  {
      Enhancer enhancer0 = new Enhancer();
      Class<Method>[] classArray0 = (Class<Method>[]) Array.newInstance(Class.class, 1);
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
