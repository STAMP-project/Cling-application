/*

 * Tue Mar 03 20:47:30 GMT 2020
 */

package com.google.javascript.rhino.head.tools.shell;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.Function;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import com.google.javascript.rhino.head.tools.shell.Global;
import com.google.javascript.rhino.head.tools.shell.ShellContextFactory;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.MalformedURLException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Global_ESTest extends Global_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Context context0 = Context.enter();
      Object[] objectArray0 = new Object[1];
      Global global0 = new Global();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Delegator delegator0 = new Delegator(global0);
      // Undeclared exception!
      try { 
        Global.sync(context0, nativeContinuation0, objectArray0, delegator0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Global global0 = new Global();
      PrintStream printStream0 = global0.getErr();
      global0.setOut(printStream0);
      PrintStream printStream1 = global0.getOut();
      assertSame(printStream1, printStream0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Context context0 = new Context();
      BaseFunction baseFunction0 = new BaseFunction(nativeJavaClass0, nativeJavaClass0);
      Object[] objectArray0 = new Object[1];
      Synchronizer synchronizer0 = new Synchronizer(nativeJavaClass0);
      // Undeclared exception!
      try { 
        Global.doctest(context0, baseFunction0, objectArray0, synchronizer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.bad.shell.function.scope
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn((ScriptableObject) null).when(context0).initStandardObjects(any(com.google.javascript.rhino.head.ScriptableObject.class) , anyBoolean());
      doReturn((Scriptable) null).when(context0).newArray(any(com.google.javascript.rhino.head.Scriptable.class) , anyInt());
      Global global0 = new Global(context0);
      Function function0 = mock(Function.class, new ViolatedAssumptionAnswer());
      doReturn(global0).when(function0).getParentScope();
      ShellContextFactory shellContextFactory0 = new ShellContextFactory();
      Context context1 = shellContextFactory0.enterContext();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Global.quit(context1, nativeContinuation0, context0.emptyArgs, function0);
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      // Undeclared exception!
      try { 
        Global.spawn(context0, nativeJavaClass0, context0.emptyArgs, nativeJavaClass0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Argument to spawn() must be a function or script.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      Global global0 = new Global(context0);
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) nativeContinuation0;
      // Undeclared exception!
      try { 
        Global.seal(context0, global0, objectArray0, nativeContinuation0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // seal function can only be applied to objects
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Context context0 = Context.enter();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      // Undeclared exception!
      try { 
        Global.runCommand(context0, nativeJavaClass0, context0.emptyArgs, nativeJavaClass0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // The first argument to runCommand must be a command name.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Global global0 = new Global();
      InputStream inputStream0 = global0.getIn();
      InputStream inputStream1 = global0.getIn();
      assertSame(inputStream1, inputStream0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Object[] objectArray0 = new Object[1];
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      // Undeclared exception!
      try { 
        Global.spawn(context0, nativeJavaClass0, objectArray0, nativeContinuation0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Argument to spawn() must be a function or script.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Context context0 = Context.enter();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) nativeJavaClass0;
      // Undeclared exception!
      try { 
        Global.seal(context0, nativeJavaClass0, objectArray0, nativeContinuation0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // seal function supports only sealing of ScriptableObject instances
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Context context0 = new Context();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) nativeJavaClass0;
      Thread thread0 = (Thread)Global.spawn(context0, nativeJavaClass0, objectArray0, nativeJavaClass0);
      assertFalse(thread0.isDaemon());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Context context0 = new Context();
      Delegator delegator0 = new Delegator();
      Global global0 = new Global(context0);
      // Undeclared exception!
      try { 
        global0.runDoctest(context0, delegator0, "js>F]ghl`:'`WUe1b~=#uI", "js>F]ghl`:'`WUe1b~=#uI", 3);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // doctest failure running:
         // F]ghl`:'`WUe1b~=#uI
         // expected: actual: js: \"doctest input\", line 1: missing ; before statement
         // js: F]ghl`:'`WUe1b~=#uI
         // js: .^
         // js: \"doctest input\", line 1: illegal character
         // js: F]ghl`:'`WUe1b~=#uI
         // js: .....^
         // js: \"doctest input\", line 1: syntax error
         // js: F]ghl`:'`WUe1b~=#uI
         // js: .......^
         // js: \"doctest input\", line 1: unterminated string literal
         // js: F]ghl`:'`WUe1b~=#uI
         // js: ..................^
         // js: \"doctest input\", line 1: Compilation produced 4 syntax errors.
         // 
         // 
         //  (js>F]ghl`:'`WUe1b~=#uI#3)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Context context0 = Context.enter();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Global.seal(context0, nativeContinuation0, context0.emptyArgs, nativeContinuation0);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Context context0 = new Context();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Global global0 = new Global();
      Object[] objectArray0 = new Object[4];
      Delegator delegator0 = new Delegator(nativeJavaClass0);
      // Undeclared exception!
      try { 
        Global.sync(context0, global0, objectArray0, delegator0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      Global global0 = new Global();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      // Undeclared exception!
      try { 
        Global.sync(context0, global0, context0.emptyArgs, nativeContinuation0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 2, 170);
      Global.pipe(false, byteArrayInputStream0, byteArrayOutputStream0);
      assertEquals(2, byteArrayOutputStream0.size());
      assertEquals("\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Object object0 = Global.toint32(context0, nativeJavaClass0, context0.emptyArgs, nativeJavaClass0);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Context context0 = Context.enter();
      Object[] objectArray0 = new Object[1];
      try { 
        Global.readFile(context0, nativeJavaClass0, objectArray0, nativeJavaClass0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // File not found: null
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      Global global0 = new Global(context0);
      Object[] objectArray0 = context0.getElements(global0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Context context0 = Context.enter();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Global global0 = new Global();
      int int0 = global0.runDoctest(context0, nativeJavaClass0, "language version", "language version", 180);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Context context0 = new Context();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Global global0 = new Global();
      Object[] objectArray0 = new Object[4];
      objectArray0[3] = (Object) global0;
      // Undeclared exception!
      try { 
        Global.runCommand(context0, global0, objectArray0, nativeJavaClass0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.bad.shell.function.scope
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Context context0 = new Context();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Context context0 = new Context();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      BaseFunction baseFunction0 = new BaseFunction();
      Object[] objectArray0 = new Object[1];
      try { 
        Global.readUrl(context0, nativeJavaClass0, objectArray0, baseFunction0);
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // no protocol: null
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Object[] objectArray0 = new Object[1];
      // Undeclared exception!
      try { 
        Global.runCommand(context0, nativeJavaClass0, objectArray0, nativeJavaClass0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.bad.shell.function.scope
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }
}
