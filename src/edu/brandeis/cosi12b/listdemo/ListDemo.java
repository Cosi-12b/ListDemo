package edu.brandeis.cosi12b.listdemo;

public class ListDemo {

  public static void main(String[] args) {
    runTests();
//    example1();
  }

  static void runTests() {
    TestSuite t;
    t = new TestSuite();
    t.runAll();
  }

  static void example1() {
    List<String> l1 = new ArrayList<String>();
    process(l1);
    System.out.println("Arraylist: " + l1);

    List<String> l2 = new LinkedList<String>();
    process(l2);
    System.out.println("Linkedlist: " + l2);
  }

  public static void process(List<String> l) {
    l.add("Schwarzentruber");
    l.add("Shapiro");
    l.add("Shen");
    l.add("Shen");
    l.add("Singh");
    l.add("Spyreas)");
  }

}
