/*

 * Tue Mar 03 18:46:48 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.JavaAdapter;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeBoolean;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeFunction;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaArray;
import com.google.javascript.rhino.head.NativeJavaTopPackage;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.NativeString;
import com.google.javascript.rhino.head.Script;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IdScriptableObject_ESTest extends IdScriptableObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.defineProperty("", class0, 67232232);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        ScriptableObject.ensureScriptable("");
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Expected argument of type object, but instead had type string
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2);
      NativeArray nativeArray1 = (NativeArray)ScriptableObject.ensureScriptable(nativeArray0);
      assertTrue(nativeArray1.isExtensible());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        Context.getContext();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ScriptableObject.defineConstProperty(nativeIterator_StopIteration0, "instance");
      assertFalse(nativeIterator_StopIteration0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Set<Object> set0 = nativeObject0.keySet();
      NativeJavaArray nativeJavaArray0 = null;
      try {
        nativeJavaArray0 = new NativeJavaArray(nativeObject0, set0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can't find top level scope for ClassCache.get
         //
         verifyException("com.google.javascript.rhino.head.ClassCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(true);
      ScriptableObject.putConstProperty(nativeBoolean0, (String) null, nativeBoolean0);
      assertFalse(nativeBoolean0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1L);
      boolean boolean0 = ScriptableObject.hasProperty((Scriptable) nativeArray0, 0);
      assertFalse(boolean0);
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeIterator_StopIteration0, (-714));
      assertTrue(nativeIterator_StopIteration0.isExtensible());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeError.init(nativeIterator_StopIteration0, true);
      assertFalse(nativeIterator_StopIteration0.isSealed());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeString nativeString0 = new NativeString("language version");
      String[] stringArray0 = new String[3];
      stringArray0[0] = "language version";
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        nativeString0.defineFunctionProperties(stringArray0, class0, 154);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Method \"language version\" not found in \"java.lang.Object\".
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = null;
      try {
        importerTopLevel0 = new ImporterTopLevel(context0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      // Undeclared exception!
      try { 
        Context.getContext();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Context.getCurrentContext();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.toArray();
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Class<String> class0 = String.class;
      String string0 = ScriptableObject.getTypedProperty((Scriptable) nativeIterator_StopIteration0, 53, class0);
      assertNull(string0);
      assertTrue(nativeIterator_StopIteration0.isEmpty());
      assertTrue(nativeIterator_StopIteration0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeFunction nativeFunction0 = mock(NativeFunction.class, CALLS_REAL_METHODS);
      ScriptableObject.putProperty((Scriptable) nativeFunction0, 8, (Object) null);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeIterator_StopIteration0, true);
      boolean boolean0 = nativeGenerator0.isGenericDescriptor(nativeGenerator0);
      assertTrue(boolean0);
      assertTrue(nativeGenerator0.isSealed());
      assertTrue(nativeIterator_StopIteration0.isEmpty());
      assertTrue(nativeGenerator0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(scriptable0).toString();
      NativeString.init(scriptable0, false);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(true);
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeBoolean0, true);
      // Undeclared exception!
      try { 
        nativeGenerator0.delete("language version");
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: language version.
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        JavaAdapter.runScript((Script) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.JavaAdapter$2", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<Object> class0 = Object.class;
      Object object0 = ScriptableObject.getTypedProperty((Scriptable) nativeObject0, "error reporter", class0);
      assertNull(object0);
      assertTrue(nativeObject0.isEmpty());
      assertTrue(nativeObject0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2);
      // Undeclared exception!
      try { 
        Context.getContext();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      boolean boolean0 = nativeJavaTopPackage0.sameValue("duplicate.defineClass.name", nativeJavaTopPackage0.EMPTY);
      assertFalse(boolean0);
      assertTrue(nativeJavaTopPackage0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(nativeIterator_StopIteration0, nativeIterator_StopIteration0, 13);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeIterator_StopIteration0, nativeIterator_StopIteration0, 1, 881);
      idFunctionObject0.checkPropertyChange("@rF 3S", scriptableObject0, scriptableObject0);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      ScriptableObject.buildDataDescriptor(nativeBoolean0, "VpnH$1P1@P9", 8);
      // Undeclared exception!
      try { 
        Context.getContext();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ScriptableObject scriptableObject0 = ScriptableObject.ensureScriptableObject(nativeIterator_StopIteration0);
      assertTrue(scriptableObject0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Object[] objectArray0 = ScriptableObject.getPropertyIds(nativeIterator_StopIteration0);
      TopLevel topLevel0 = new TopLevel();
      IdFunctionObject idFunctionObject0 = nativeIterator_StopIteration0.exportAsJSClass(13, topLevel0, false);
      BoundFunction boundFunction0 = new BoundFunction((Context) null, nativeIterator_StopIteration0, idFunctionObject0, nativeIterator_StopIteration0, objectArray0);
      assertEquals(1, idFunctionObject0.methodId());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeFunction nativeFunction0 = mock(NativeFunction.class, CALLS_REAL_METHODS);
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = null;
      try {
        importerTopLevel0 = new ImporterTopLevel(context0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeIterator_StopIteration0, true);
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        nativeGenerator0.defineProperty("language version", class0, 7);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }
}
