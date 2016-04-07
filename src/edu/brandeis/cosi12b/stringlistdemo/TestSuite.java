package edu.brandeis.cosi12b.stringlistdemo;

public class TestSuite {
  int testNumber = 0;
  String testGroupName = "";
  String curTestName = "";

  public void runAll() {
    runArrayListTests();
    runLinkedListTests();
  }

  public void runArrayListTests() {
    testGroupName = "ArrayList";
    arrayListtest1();
    arrayListtest2();
    arrayListtest3();
    arrayListtest4();
    arrayListtest5();
    arrayListtest6();
    arrayListtest7();
    arrayListtest8();
    arrayListtest9();

  }

  public void runLinkedListTests() {
    testGroupName = "LinkedListTest";
    linkedListtest1();
    linkedListtest2();
    linkedListtest3();
    linkedListtest4();
    linkedListtest5();
    linkedListtest6();
    linkedListtest7();
  }

  /*
   * Test Suites
   */
  public boolean linkedListtest1() {
    setTest("length 0");
    LinkedList<String> l = new LinkedList<String>();
    if (l.length() != 0) {
      return error("");
    } else
      return success("");
  }

  public boolean linkedListtest2() {
    setTest("length 1");
    LinkedList<String> l = new LinkedList<String>();
    l.add("Seth");
    if (l.length() != 1) {
      return error("");
    } else
      return (success(""));
  }

  public boolean linkedListtest3() {
    setTest("toString");
    LinkedList<String> l = new LinkedList<String>();
    l.add("Seth");
    l.add("Elana");
    if (!l.toString().equals("[Seth, Elana]")) {
      return error(l.toString());
    } else {
      return success("");
    }
  }

  public boolean linkedListtest4() {
    setTest("Get(1)");
    LinkedList<String> list1 = new LinkedList<String>();
    list1.add("Shuyuan");
    list1.add("Nora");
    list1.add("Qifu");
    list1.add("Austin");
    if (list1.length() != 4)
      return error("Length ne 4");
    if (!list1.get(1).equals("Nora"))
      return error("add in the middle index 2 was: " + list1.get(2));
    return success("");
  }

  public boolean linkedListtest5() {
    setTest("Remove 2");
    LinkedList<String> list1 = new LinkedList<String>();
    list1.add("Shuyuan");
    list1.add("Nora");
    list1.add("Qifu");
    list1.add("Austin");
    list1.remove(2);
    if ((list1.length() != 3) || (!list1.get(2).equals("Austin"))) {
      return error("remove in the middle failed");
    }
    return success("");

  }

  public boolean linkedListtest6() {
    setTest("Indexof");
    LinkedList<String> list1 = new LinkedList<String>();
    list1.add("Shuyuan");
    list1.add("Nora");
    list1.add("Qifu");
    list1.add("Austin");
    list1.remove(2);
    if (list1.indexOf("Qifu") != -1)
      return error("indexof error");
    return success("");
  }

  public boolean linkedListtest7() {
    setTest("Remove 0");
    LinkedList<String> list1 = new LinkedList<String>();
    list1.add("Shuyuan");
    list1.add("Nora");
    list1.add("Qifu");
    list1.add("Austin");
    list1.remove(0);
    if (!list1.get(0).equals("Nora")) {
      return error("Remove 0 failed");
    } else {
      return success("");
    }
  }

  /*
   * Test Suites
   */
  public boolean arrayListtest1() {
    setTest("length 0");
    ArrayList<String> a = new ArrayList<String>();
    if (a.size() != 0) {
      return error("");
    } else
      return success("");
  }

  public boolean arrayListtest2() {
    setTest("size 1");
    ArrayList<String> a = new ArrayList<String>();
    a.add("Coco");
    if (a.size() != 1) {
      return error("Test2");
    } else
      return (success("Test2"));
  }

  public boolean arrayListtest3() {
    setTest("toString");
    ArrayList<String> a = new ArrayList<String>();
    a.add("Skye");
    a.add("Zachary");
    if (!a.toString().equals("[Skye, Zachary]")) {
      return error("Test3: " + a.toString());
    } else {
      return success("Test3");
    }
  }

  public boolean arrayListtest4() {
    setTest("Add in middle");
    ArrayList<String> list1 = new ArrayList<String>();
    list1.add("Seth");
    list1.add("Austin");
    list1.add("Claire");
    list1.add("Zhuyu");
    if (list1.size() != 4)
      return error("Length ne 4");
    list1.set(3, "Jon");
    if (list1.size() != 4)
      return error("wrong length: " + list1.size());
    if (!list1.get(2).equals("Claire"))
      return error("index 2 was: " + list1.get(2));
    if (!list1.get(3).equals("Jon"))
      return error("index 3 was: " + list1.get(3));
    return success("");
  }

  public boolean arrayListtest5() {
    setTest("Remove in middle");
    ArrayList<String> list1 = new ArrayList<String>();
    list1.add("Seth");
    list1.add("Austin");
    list1.add("Claire");
    list1.add("Zhuyu");
    list1.remove(2);
    if ((list1.size() != 3) || (!list1.get(2).equals("Zhuyu"))) {
      return error("");
    }
    return success("");

  }

  public boolean arrayListtest6() {
    setTest("Indexof and Contains");
    ArrayList<String> list1 = new ArrayList<String>();
    list1.add("Seth");
    list1.add("Austin");
    list1.add("Claire");
    list1.add("Zhuyu");
    if (list1.indexOf("Claire") != 2)
      return error("indexof error");
    if (list1.contains("Peter") == true)
      return error("contains error: " + list1.contains("Peter"));
    if (list1.isEmpty())
      return error("isEmpty error");
    return success("");
  }

  public boolean arrayListtest7() {
    setTest("Capacity check");
    ArrayList<String> list1 = new ArrayList<String>(20);
    if (list1.size() != 0)
      return error("incorrect length");
    if (list1.capacity() != 20)
      return error("incorect capacity");
    return success("test7");
  }

  public boolean arrayListtest8() {
    setTest("Array Index Check");
    ArrayList<String> list1 = new ArrayList<String>(20);
    list1.add("Chloe");
    if (list1.get(0) != "Chloe")
      return error("get failure");
    try {
      list1.get(1);
    } catch (ArrayIndexOutOfBoundsException e) {
      return success("");
    }
    return error("didn't throw exception");
  }

  public boolean arrayListtest9() {
    setTest("Array Expansion");
    ArrayList<String> list1 = new ArrayList<String>(20);
    list1.set(30, "McGregor");
    try {
      String value = list1.get(30);
      if (!value.equals("McGregor"))
        return error("didn't work");
    } catch (Exception e) {
      return error("caused an exception");
    }
    return success("");
  }

  /*
   * Utility methods
   */

  private boolean error(String message) {
    System.out.println(String.format("FAIL: %s %d %s", testGroupName, testNumber, curTestName));
    return false;
  }

  private boolean success(String message) {
    System.out.println(String.format("OK:   %s %d %s", testGroupName, testNumber, curTestName));
    return true;
  }
  
  private void setTest(String currentTest) {
    testNumber++;
    curTestName = currentTest;
  }

}
