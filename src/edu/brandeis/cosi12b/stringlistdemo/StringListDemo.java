package edu.brandeis.cosi12b.stringlistdemo;

public class StringListDemo {

  public static void main(String[] args) {
    runTests();
    example1();
  }

  static void runTests() {
    TestSuite t;
    t = new TestSuite();
    t.runAll();
  }

  static void example1() {
    StringList l1 = new StringArrayList();
    process(l1);
    System.out.println("Arraylist: " + l1);

    StringList l2 = new StringLinkedList();
    process(l2);
    System.out.println("Linkedlist: " + l2);
  }

  public static void process(StringList l) {
    l.add("Schwarzentruber");
    l.add("Shapiro");
    l.add("Shen");
    l.add("Shen");
    l.add("Singh");
    l.add("Spyreas)");
  }

}
