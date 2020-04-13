/*

 * Tue Mar 03 14:01:45 GMT 2020
 */

package org.mockito.cglib.proxy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.cglib.proxy.Callback;
import org.mockito.cglib.proxy.Enhancer;
import org.mockito.internal.MockHandler;
import org.mockito.internal.creation.MethodInterceptorFilter;
import org.mockito.internal.creation.MockSettingsImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Enhancer_ESTest extends Enhancer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<MethodInterceptorFilter> class0 = MethodInterceptorFilter.class;
      MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
      MockHandler<Class<Object>> mockHandler0 = new MockHandler<Class<Object>>(mockSettingsImpl0);
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
      Enhancer enhancer0 = new Enhancer();
      enhancer0.setCallbacks((Callback[]) null);
      MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
      MockHandler<Class<Object>> mockHandler0 = new MockHandler<Class<Object>>(mockSettingsImpl0);
      MethodInterceptorFilter methodInterceptorFilter0 = new MethodInterceptorFilter(mockHandler0, mockSettingsImpl0);
      Class<Object> class0 = Object.class;
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
      LinkedList<InputStream> linkedList0 = new LinkedList<InputStream>();
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
      Class<Annotation> class0 = Annotation.class;
      LinkedList<Annotation> linkedList0 = new LinkedList<Annotation>();
      // Undeclared exception!
      try { 
        enhancer0.filterConstructors(class0, linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No visible constructors in interface java.lang.annotation.Annotation
         //
         verifyException("org.mockito.cglib.proxy.Enhancer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Enhancer enhancer0 = new Enhancer();
      enhancer0.setCallbacks((Callback[]) null);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Class<InputStream> class0 = InputStream.class;
      // Undeclared exception!
      try { 
        enhancer0.filterConstructors(class0, linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No visible constructors in class java.io.InputStream
         //
         verifyException("org.mockito.cglib.proxy.Enhancer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
      MockHandler<Class<Object>> mockHandler0 = new MockHandler<Class<Object>>(mockSettingsImpl0);
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
      Class<String> class0 = String.class;
      enhancer0.setSuperclass(class0);
      LinkedList<InputStream> linkedList0 = new LinkedList<InputStream>();
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
  public void test09()  throws Throwable  {
      Enhancer enhancer0 = new Enhancer();
      enhancer0.setSuperclass((Class) null);
      Callback[] callbackArray0 = new Callback[3];
      MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
      MockHandler<Class<Object>> mockHandler0 = new MockHandler<Class<Object>>(mockSettingsImpl0);
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
  public void test10()  throws Throwable  {
      Enhancer enhancer0 = new Enhancer();
      Class<LinkedList<Object>>[] classArray0 = (Class<LinkedList<Object>>[]) Array.newInstance(Class.class, 0);
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
      Enhancer enhancer0 = new Enhancer();
      Class<Object> class0 = Object.class;
      enhancer0.setSuperclass(class0);
      Class<MethodInterceptorFilter>[] classArray0 = (Class<MethodInterceptorFilter>[]) Array.newInstance(Class.class, 3);
      Class<MethodInterceptorFilter> class1 = MethodInterceptorFilter.class;
      classArray0[0] = class1;
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
  public void test13()  throws Throwable  {
      Enhancer enhancer0 = new Enhancer();
      Class<Method> class0 = Method.class;
      enhancer0.setSuperclass(class0);
      Class<MethodInterceptorFilter>[] classArray0 = (Class<MethodInterceptorFilter>[]) Array.newInstance(Class.class, 2);
      Class<MethodInterceptorFilter> class1 = MethodInterceptorFilter.class;
      classArray0[0] = class1;
      classArray0[1] = class1;
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
      MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
      MockHandler<Class<Object>> mockHandler0 = new MockHandler<Class<Object>>(mockSettingsImpl0);
      MethodInterceptorFilter methodInterceptorFilter0 = new MethodInterceptorFilter(mockHandler0, mockSettingsImpl0);
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
  public void test16()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 0);
      Enhancer enhancer0 = new Enhancer();
      Callback[] callbackArray0 = new Callback[3];
      MockHandler<Class<Object>> mockHandler0 = new MockHandler<Class<Object>>((MockSettingsImpl) null);
      MethodInterceptorFilter methodInterceptorFilter0 = new MethodInterceptorFilter(mockHandler0, (MockSettingsImpl) null);
      callbackArray0[0] = (Callback) methodInterceptorFilter0;
      callbackArray0[1] = (Callback) methodInterceptorFilter0;
      callbackArray0[2] = (Callback) methodInterceptorFilter0;
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
  public void test17()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 0);
      Enhancer enhancer0 = new Enhancer();
      MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
      MockHandler<Class<Object>> mockHandler0 = new MockHandler<Class<Object>>(mockSettingsImpl0);
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
      Enhancer enhancer0 = new Enhancer();
      Class<Enhancer>[] classArray0 = (Class<Enhancer>[]) Array.newInstance(Class.class, 0);
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
