public class MyContactManager {
    public static void main(String[] args) {
        ContactsManager myContactManager = new ContactsManager();

        Contact friend1 = new Contact("Fatma", "0220626414");
        myContactManager.addContact(friend1);

        Contact friend2=new Contact("Safiye", "0755166188");
        myContactManager.addContact(friend2);

        Contact friend3=new Contact("Necla", "0550422993");
        myContactManager.addContact(friend2);

        System.out.print(myContactManager.searchContact(friend2));
    }
}
