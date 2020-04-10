/*

 * Tue Mar 03 20:44:12 GMT 2020
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
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.Function;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import com.google.javascript.rhino.head.tools.shell.Global;
import com.google.javascript.rhino.head.tools.shell.ShellContextFactory;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Global_ESTest extends Global_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object[] objectArray0 = new Object[2];
      // Undeclared exception!
      try { 
        Global.sync(context0, global0, objectArray0, (Function) null);
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
      PrintStream printStream0 = global0.getOut();
      global0.setOut(printStream0);
      PrintStream printStream1 = global0.getOut();
      assertSame(printStream1, printStream0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = Context.getCurrentContext();
      BaseFunction baseFunction0 = new BaseFunction();
      Object object0 = Global.toint32(context0, global0, context0.emptyArgs, baseFunction0);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = Context.getCurrentContext();
      context0.getElements(global0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      global0.init(contextFactory0);
      assertEquals("global", global0.getClassName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Object[] objectArray0 = new Object[2];
      // Undeclared exception!
      try { 
        Global.doctest((Context) null, nativeJavaClass0, objectArray0, nativeJavaClass0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.bad.shell.function.scope
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      // Undeclared exception!
      try { 
        Global.spawn((Context) null, global0, context0.emptyArgs, nativeJavaClass0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Argument to spawn() must be a function or script.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Context context0 = Context.enter();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeObject nativeObject0 = new NativeObject();
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) nativeObject0;
      // Undeclared exception!
      try { 
        Global.seal(context0, nativeContinuation0, objectArray0, nativeContinuation0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // seal function can only be applied to objects
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Context context0 = Context.enter();
      Global global0 = new Global(context0);
      PrintStream printStream0 = global0.getOut();
      // Undeclared exception!
      try { 
        Global.pipe(false, (InputStream) null, printStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Context context0 = new Context();
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
  public void test09()  throws Throwable  {
      Context context0 = Context.enter();
      Global global0 = new Global(context0);
      InputStream inputStream0 = global0.getIn();
      assertNotNull(inputStream0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Context context0 = Context.enter();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Object[] objectArray0 = new Object[18];
      // Undeclared exception!
      try { 
        Global.spawn(context0, nativeContinuation0, objectArray0, nativeContinuation0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Argument to spawn() must be a function or script.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Global global0 = new Global();
      Context context0 = contextFactory0.enterContext();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Synchronizer synchronizer0 = new Synchronizer(nativeJavaClass0);
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) synchronizer0;
      // Undeclared exception!
      try { 
        Global.seal(context0, global0, objectArray0, nativeJavaClass0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // seal function supports only sealing of ScriptableObject instances
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Object[] objectArray0 = new Object[4];
      objectArray0[3] = (Object) scriptable0;
      Function function0 = mock(Function.class, new ViolatedAssumptionAnswer());
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      Synchronizer synchronizer0 = new Synchronizer(importerTopLevel0, (Object) null);
      // Undeclared exception!
      try { 
        Global.runCommand(context0, synchronizer0, objectArray0, function0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot convert null to an object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      Global global0 = new Global(context0);
      NativeArray nativeArray0 = global0.history;
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, global0, 12, "js>rr", 100, nativeArray0);
      Object[] objectArray0 = context0.getElements(idFunctionObject0);
      assertEquals(100, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("js>-8d;h{zQm");
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Object[] objectArray0 = new Object[4];
      objectArray0[3] = (Object) scriptable0;
      Function function0 = mock(Function.class, new ViolatedAssumptionAnswer());
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      Synchronizer synchronizer0 = new Synchronizer(importerTopLevel0, (Object) null);
      // Undeclared exception!
      try { 
        Global.runCommand(context0, synchronizer0, objectArray0, function0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot convert null to an object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Object[] objectArray0 = new Object[0];
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Global.seal((Context) null, importerTopLevel0, objectArray0, nativeJavaClass0);
      assertEquals("JavaImporter", importerTopLevel0.getClassName());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object[] objectArray0 = new Object[11];
      // Undeclared exception!
      try { 
        Global.sync(context0, global0, objectArray0, (Function) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        Global.pipe(true, (InputStream) null, (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Context context0 = new Context();
      // Undeclared exception!
      try { 
        Global.sync(context0, (Scriptable) null, context0.emptyArgs, (Function) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Global global0 = new Global();
      PrintStream printStream0 = global0.getOut();
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Global.pipe(false, byteArrayInputStream0, printStream0);
      assertEquals(0, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      try { 
        Global.readFile((Context) null, nativeJavaClass0, objectArray0, nativeJavaClass0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // File not found: null
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          Global global0 = new Global();
          Context context0 = Context.getCurrentContext();
          BaseFunction baseFunction0 = new BaseFunction();
          BaseFunction baseFunction1 = new BaseFunction(global0, baseFunction0);
          Object[] objectArray0 = new Object[1];
          // Undeclared exception!
          try { 
            Global.runCommand(context0, global0, objectArray0, baseFunction1);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"<<ALL FILES>>\" \"execute\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkExec(SecurityManager.java:799)
             // java.lang.ProcessBuilder.start(ProcessBuilder.java:1018)
             // java.lang.Runtime.exec(Runtime.java:621)
             // java.lang.Runtime.exec(Runtime.java:486)
             // com.google.javascript.rhino.head.tools.shell.Global.runProcess(Global.java:930)
             // com.google.javascript.rhino.head.tools.shell.Global.runCommand(Global.java:760)
             // sun.reflect.GeneratedMethodAccessor226.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Context context0 = Context.enter();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      context0.initStandardObjects((ScriptableObject) nativeContinuation0);
      Object[] objectArray0 = context0.getElements(nativeContinuation0);
      assertFalse(nativeContinuation0.isEmpty());
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = new Context();
      int int0 = global0.runDoctest(context0, global0, "error reporter", "error reporter", 2777);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = Context.enter();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      Synchronizer synchronizer0 = new Synchronizer(scriptableObject0);
      Object[] objectArray0 = new Object[5];
      objectArray0[4] = (Object) scriptableObject0;
      // Undeclared exception!
      try { 
        Global.runCommand(context0, global0, objectArray0, synchronizer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.bad.shell.function.scope
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Global global0 = new Global();
      ShellContextFactory shellContextFactory0 = new ShellContextFactory();
      Context context0 = shellContextFactory0.enterContext();
      Object[] objectArray0 = new Object[1];
      try { 
        Global.readUrl(context0, global0, objectArray0, (Function) null);
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // no protocol: null
         //
         verifyException("java.net.URL", e);
      }
  }
}
