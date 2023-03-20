package bt2;

import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {

        LinkedList<String> testLinkedList = new LinkedList<>();
        testLinkedList.add("hung");
        testLinkedList.addFirst("nam");
        testLinkedList.addLast("Khiết");

        testLinkedList.remove(0);
        System.out.println(testLinkedList);
        System.out.println(testLinkedList.contains("hung"));
        System.out.println(testLinkedList.indexOf("Khiết"));

    }

}
