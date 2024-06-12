public class Main {
    public static void main(String[] args) {
        linked_list testList = new linked_list();
        testList.addKnot(new ll_knot());
        testList.getKnot(0).setData("Hello World!");
        System.out.println(testList.getKnot(0).getData());
    }
}
