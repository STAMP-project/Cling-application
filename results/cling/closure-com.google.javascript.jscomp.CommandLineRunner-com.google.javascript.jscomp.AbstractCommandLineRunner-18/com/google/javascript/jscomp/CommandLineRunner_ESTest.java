/*

 * Tue Mar 03 19:09:54 GMT 2020
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Function;
import com.google.common.base.Supplier;
import com.google.javascript.jscomp.AbstractCommandLineRunner;
import com.google.javascript.jscomp.CommandLineRunner;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.JSModuleGraph;
import com.google.javascript.jscomp.Result;
import com.google.javascript.jscomp.SourceFile;
import java.io.CharArrayWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CommandLineRunner_ESTest extends CommandLineRunner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Stack<String> stack0 = new Stack<String>();
      stack0.add("");
      CompilerOptions compilerOptions0 = new CompilerOptions();
      // Undeclared exception!
      try { 
        AbstractCommandLineRunner.createDefineOrTweakReplacements(stack0, compilerOptions0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // --define flag syntax invalid: 
         //
         verifyException("com.google.javascript.jscomp.AbstractCommandLineRunner", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Stack<String> stack0 = new Stack<String>();
      stack0.add("Eu)KcGE6\"s:T=");
      CompilerOptions compilerOptions0 = new CompilerOptions();
      // Undeclared exception!
      try { 
        AbstractCommandLineRunner.createDefineOrTweakReplacements(stack0, compilerOptions0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // --define flag syntax invalid: Eu)KcGE6\"s:T=
         //
         verifyException("com.google.javascript.jscomp.AbstractCommandLineRunner", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Stack<String> stack0 = new Stack<String>();
      stack0.add("T~p={]z9, 0c~~Q6x");
      CompilerOptions compilerOptions0 = new CompilerOptions();
      // Undeclared exception!
      try { 
        AbstractCommandLineRunner.createDefineOrTweakReplacements(stack0, compilerOptions0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // --define flag syntax invalid: T~p={]z9, 0c~~Q6x
         //
         verifyException("com.google.javascript.jscomp.AbstractCommandLineRunner", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Stack<String> stack0 = new Stack<String>();
      stack0.push("Internal Error: Don't know how to handle {0}");
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      try { 
        commandLineRunner0.createJsModules(stack0, stack0);
        fail("Expecting exception: AbstractCommandLineRunner.FlagUsageException");
      
      } catch(AbstractCommandLineRunner.FlagUsageException e) {
         //
         // Invalid module name: 'Internal Error'
         //
         verifyException("com.google.javascript.jscomp.AbstractCommandLineRunner", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("Intrnal Error: Don't know how to handle {0}");
      AbstractCommandLineRunner.writeOutput(stringBuilder0, (Compiler) null, "Intrnal Error: Don't know how to handle {0}", "ths error manager cannot be null", "Intrnal Error: Don't know how to handle {0}");
      assertEquals("Intrnal Error: Don't know how to handle {0}Intrnal Error: Don't know how to handle {0}\n", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[0];
      List<String> list0 = ResourceBundle.Control.FORMAT_DEFAULT;
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      // Undeclared exception!
      try { 
        commandLineRunner0.createJsModules(list0, (List<String>) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Stack<String> stack0 = new Stack<String>();
      stack0.push("Internal Error: Don't know how to handle {0}");
      ArrayList<JSModule> arrayList0 = new ArrayList<JSModule>();
      try { 
        AbstractCommandLineRunner.parseModuleWrappers(stack0, arrayList0);
        fail("Expecting exception: AbstractCommandLineRunner.FlagUsageException");
      
      } catch(AbstractCommandLineRunner.FlagUsageException e) {
         //
         // Unknown module: 'Internal Error'
         //
         verifyException("com.google.javascript.jscomp.AbstractCommandLineRunner", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      commandLineRunner0.checkModuleName("on");
      assertTrue(commandLineRunner0.shouldRunCompiler());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String[] stringArray0 = new String[0];
          // Undeclared exception!
          try { 
            CommandLineRunner.main(stringArray0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"exitVM.-2\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkExit(SecurityManager.java:761)
             // java.lang.Runtime.exit(Runtime.java:108)
             // java.lang.System.exit(System.java:973)
             // com.google.javascript.jscomp.AbstractCommandLineRunner.run(AbstractCommandLineRunner.java:377)
             // com.google.javascript.jscomp.CommandLineRunner.main(CommandLineRunner.java:912)
             // sun.reflect.GeneratedMethodAccessor117.invoke(Unknown Source)
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
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      // Undeclared exception!
      try { 
        commandLineRunner0.createJsModules((List<String>) null, (List<String>) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      // Undeclared exception!
      try { 
        commandLineRunner0.createExterns();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // in is null
         //
         verifyException("java.util.zip.ZipInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[0];
      List<String> list0 = ResourceBundle.Control.FORMAT_CLASS;
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      List<SourceFile> list1 = commandLineRunner0.createInputs(list0, true);
      assertTrue(commandLineRunner0.shouldRunCompiler());
      assertEquals(1, list1.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[0];
      List<String> list0 = ResourceBundle.Control.FORMAT_CLASS;
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      try { 
        commandLineRunner0.createJsModules(list0, list0);
        fail("Expecting exception: AbstractCommandLineRunner.FlagUsageException");
      
      } catch(AbstractCommandLineRunner.FlagUsageException e) {
         //
         // Expected 2-4 colon-delimited parts in module spec: java.class
         //
         verifyException("com.google.javascript.jscomp.AbstractCommandLineRunner", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Stack<String> stack0 = new Stack<String>();
      stack0.add("~-9:QW|$VC8=\"E $1-]");
      CompilerOptions compilerOptions0 = new CompilerOptions();
      // Undeclared exception!
      try { 
        AbstractCommandLineRunner.createDefineOrTweakReplacements(stack0, compilerOptions0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // --define flag syntax invalid: ~-9:QW|$VC8=\"E $1-]
         //
         verifyException("com.google.javascript.jscomp.AbstractCommandLineRunner", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      Supplier<List<SourceFile>> supplier0 = (Supplier<List<SourceFile>>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      Supplier<List<JSModule>> supplier1 = (Supplier<List<JSModule>>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      Function<Integer, Boolean> function0 = (Function<Integer, Boolean>) mock(Function.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        commandLineRunner0.enableTestMode(supplier0, supplier0, supplier1, function0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("Intrnal Error: Don't know how to handle {0}");
      AbstractCommandLineRunner.writeOutput(stringBuilder0, (Compiler) null, "Intrnal Error: Don't know how to handle {0}", "Intrnal Error: Don't know how to handle {0}", "Intrnal Error: Don't know how to handle {0}");
      assertEquals("Intrnal Error: Don't know how to handle {0}Intrnal Error: Don't know how to handle {0}\n", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ArrayList<JSModule> arrayList0 = new ArrayList<JSModule>();
      // Undeclared exception!
      try { 
        AbstractCommandLineRunner.parseModuleWrappers((List<String>) null, arrayList0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Stack<String> stack0 = new Stack<String>();
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      // Undeclared exception!
      try { 
        commandLineRunner0.createJsModules(stack0, stack0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      Vector<JSModule> vector0 = new Vector<JSModule>();
      JSModuleGraph jSModuleGraph0 = new JSModuleGraph(vector0);
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(784);
      commandLineRunner0.printModuleGraphManifestOrBundleTo(jSModuleGraph0, charArrayWriter0, false);
      assertTrue(commandLineRunner0.shouldRunCompiler());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String[] stringArray0 = new String[1];
          stringArray0[0] = "--=";
          // Undeclared exception!
          try { 
            CommandLineRunner.main(stringArray0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"exitVM.-1\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkExit(SecurityManager.java:761)
             // java.lang.Runtime.exit(Runtime.java:108)
             // java.lang.System.exit(System.java:973)
             // com.google.javascript.jscomp.CommandLineRunner.main(CommandLineRunner.java:914)
             // sun.reflect.GeneratedMethodAccessor117.invoke(Unknown Source)
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
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ArrayList<JSModule> arrayList0 = new ArrayList<JSModule>();
      Map<String, String> map0 = AbstractCommandLineRunner.parseModuleWrappers(linkedList0, arrayList0);
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          String[] stringArray0 = new String[0];
          CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
          // Undeclared exception!
          try { 
            commandLineRunner0.filenameToOutputStream("5S}@etmFlA|W RS");
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"5S}@etmFlA|W RS\" \"write\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             // java.io.FileOutputStream.<init>(FileOutputStream.java:200)
             // java.io.FileOutputStream.<init>(FileOutputStream.java:101)
             // com.google.javascript.jscomp.AbstractCommandLineRunner.filenameToOutputStream(AbstractCommandLineRunner.java:1133)
             // sun.reflect.GeneratedMethodAccessor116.invoke(Unknown Source)
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
      List<String> list0 = ResourceBundle.Control.FORMAT_DEFAULT;
      CompilerOptions compilerOptions0 = new CompilerOptions();
      AbstractCommandLineRunner.createDefineOrTweakReplacements(list0, compilerOptions0, false);
      assertFalse(compilerOptions0.inlineConstantVars);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Vector<JSModule> vector0 = new Vector<JSModule>();
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      CompilerOptions compilerOptions0 = commandLineRunner0.createOptions();
      // Undeclared exception!
      try { 
        commandLineRunner0.processResults((Result) null, vector0, compilerOptions0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.AbstractCommandLineRunner", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      CompilerOptions compilerOptions0 = new CompilerOptions();
      commandLineRunner0.setRunOptions(compilerOptions0);
      assertTrue(commandLineRunner0.shouldRunCompiler());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-=";
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      CompilerOptions compilerOptions0 = commandLineRunner0.createOptions();
      commandLineRunner0.setRunOptions(compilerOptions0);
      assertFalse(compilerOptions0.generatePseudoNames);
      assertFalse(commandLineRunner0.shouldRunCompiler());
  }
}
