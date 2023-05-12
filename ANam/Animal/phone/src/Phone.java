public abstract class Phone {
   abstract void insertPhone(Contact contact);
     abstract void removePhone(String name);
   abstract void updatePhone(String name, String newPhone);
  abstract void displayPhone(Contact contact);
    public Phone() {
    }
}
