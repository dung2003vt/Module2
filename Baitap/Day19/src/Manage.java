public interface Manage<E> {
    void create();
    void update();
    E delete();
    void searchById();
}
