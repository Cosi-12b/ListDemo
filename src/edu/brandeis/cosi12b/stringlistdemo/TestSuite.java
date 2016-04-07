package edu.brandeis.cosi12b.stringlistdemo;

public class TestSuite {
  
  public void runAll() {
    runArrayListTests();
    runLinkedListTests();
  }
  
  public void runArrayListTests() {
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
      LinkedList<String> l = new LinkedList<String>();
      if (l.length() != 0) {
        return error("Test1");
      } else
        return success("Test1");
    }

    public boolean linkedListtest2() {
      LinkedList<String> l = new LinkedList<String>();
      l.add("Seth");
      if (l.length() != 1) {
        return error("Test2");
      } else
        return (success("Test2"));
    }

    public boolean linkedListtest3() {
      LinkedList<String> l = new LinkedList<String>();
      l.add("Seth");
      l.add("Elana");
      if (!l.toString().equals("[Seth, Elana]")) {
        return error("Test3: " + l.toString());
      } else {
        return success("Test3");
      }
    }

    public boolean linkedListtest4() {
      LinkedList<String> list1 = new LinkedList<String>();
      list1.add("Shuyuan");
      list1.add("Nora");
      list1.add("Qifu");
      list1.add("Austin");
      if (list1.length() != 4)
        return error("test4: Length ne 4");
      if (!list1.get(1).equals("Nora"))
        return error("test4: add in the middle index 2 was: " + list1.get(2));
      return success("test4");
    }

    public boolean linkedListtest5() {
      LinkedList<String> list1 = new LinkedList<String>();
      list1.add("Shuyuan");
      list1.add("Nora");
      list1.add("Qifu");
      list1.add("Austin");
      list1.remove(2);
      if ((list1.length() != 3) || (!list1.get(2).equals("Austin"))) {
        return error("test5: remove in the middle failed");
      }
      return success("test5");

    }

    public boolean linkedListtest6() {
      LinkedList<String> list1 = new LinkedList<String>();
      list1.add("Shuyuan");
      list1.add("Nora");
      list1.add("Qifu");
      list1.add("Austin");
      list1.remove(2);
      if (list1.indexOf("Qifu") != -1)
        return error("test6: indexof error");
      return success("test6");
    }

    public boolean linkedListtest7() {
      LinkedList<String> list1 = new LinkedList<String>();
      list1.add("Shuyuan");
      list1.add("Nora");
      list1.add("Qifu");
      list1.add("Austin");
      list1.remove(0);
      if (!list1.get(0).equals("Nora")) {
        return error("test7: Remove 0 failed");
      } else {
        return success("test7");
      }
    }
  
  /*
   * Test Suites
   */
  public boolean arrayListtest1() {
    ArrayList a = new ArrayList();
    if (a.size() != 0) {
      return error("Test1");
    } else
      return success("Test1");
  }

  public boolean arrayListtest2() {
    ArrayList a = new ArrayList();
    a.add("Coco");
    if (a.size() != 1) {
      return error("Test2");
    } else
      return (success("Test2"));
  }

  public boolean arrayListtest3() {
    ArrayList a = new ArrayList();
    a.add("Skye");
    a.add("Zachary");
    if (!a.toString().equals("[Skye, Zachary]")) {
      return error("Test3: " + a.toString());
    } else {
      return success("Test3");
    }
  }
  
  public boolean arrayListtest4() {
    ArrayList list1= new ArrayList();
    list1.add("Seth");
    list1.add("Austin");
    list1.add("Claire");
    list1.add("Zhuyu");
    if (list1.size() != 4)
      return error("test4: Length ne 4");
    list1.set(3,"Jon");
    if (list1.size() != 4)
      return error("test4: add in the middle, wrong length: "+list1.size());
    if (!list1.get(2).equals("Claire"))
      return error("test4: add in the middle index 2 was: "+list1.get(2));
    if (!list1.get(3).equals("Jon"))
      return error("test4: add in the middle index 3 was: "+list1.get(3));
    return success("test4");
  }
  
  public boolean arrayListtest5() {
    ArrayList list1= new ArrayList();
    list1.add("Seth");
    list1.add("Austin");
    list1.add("Claire");
    list1.add("Zhuyu");
    list1.remove(2);
    if ((list1.size() != 3) || (!list1.get(2).equals("Zhuyu"))) {
      return error("test5: remove in the middle failed");
    }
    return success("test5");
    
  }
  
  public boolean arrayListtest6() {
    ArrayList list1= new ArrayList();
    list1.add("Seth");
    list1.add("Austin");
    list1.add("Claire");
    list1.add("Zhuyu");
    if (list1.indexOf("Claire") != 2)
      return error("test6: indexof error");
    if (list1.contains("Peter") == true)
      return error("test6: contains error: " + list1.contains("Peter"));
    if (list1.isEmpty())
      return error("test6: isEmpty error");
    return success("test6");
  }
  
  public boolean arrayListtest7() {
    ArrayList list1= new ArrayList(20);
    if (list1.size() != 0)
        return error("test7: incorrect length");
    if (list1.capacity() != 20)
      return error("test7: incorect capacity");
    return success("test7");
  }
  
  public boolean arrayListtest8() {
    ArrayList list1 = new ArrayList(20);
    list1.add("Chloe");
    if (list1.get(0) != "Chloe")
      return error("test8: get failure");
    try {
      list1.get(1);
    } catch (ArrayIndexOutOfBoundsException e)  {
        return success("test8");
    }
    return error("test8: didn't throw exception");
  }
  
  public boolean arrayListtest9() {
    ArrayList<String> list1 = new ArrayList<String>(20);
    list1.set(30, "McGregor");
    try {
      String value = list1.get(30);
      if (!value.equals("McGregor")) 
        return error("test9: expansion of underlying array didn't work");
      } catch (Exception e) {
        return error("test9: expansion caused an exception");
    }
    return success("test9");
  }


  /*
   * Utility methods
   */

  private boolean error(String message) {
    System.out.println("ERROR: " + message);
    return false;
  }

  private boolean success(String message) {
    System.out.println("OK: " + message);
    return true;
  }

}
