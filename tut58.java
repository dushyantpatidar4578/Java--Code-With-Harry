import java.util.ArrayDeque; // run Array Deque

class tut58 {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(77);
        ad1.addFirst(99);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());

        // All method same as ArrayList
    }
}
