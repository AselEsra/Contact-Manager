public class MyContactManager {
    public static void main(String[] args) {
        ContactsManager myContactManager = new ContactsManager();

        Contact friend1 = new Contact("Fatma", "0220626414");
        myContactManager.addContact(friend1);

        Contact friend2=new Contact("Safiye", "0755166188");
        myContactManager.addContact(friend2);

        Contact friend3=new Contact("Necla", "0550422993");
        myContactManager.addContact(friend3);

        System.out.print(myContactManager.searchContact(friend2));
    }
}

class Contact{
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber){
        this.name=name;
        this.phoneNumber=phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

class ContactsManager {
    Contact [] myContacts;
    private int indexOfContacts;

    ContactsManager(){
        myContacts = new Contact[10];
        indexOfContacts=0;
    }

    public void addContact(Contact contact){
        myContacts[indexOfContacts]=contact;
        indexOfContacts++;
    }
    public String searchContact(Contact contact){
        for(int i=0; i<indexOfContacts; i++){
            if(myContacts[i].equals(contact)){
                return "Phone number of the searched contact is: " + myContacts[i].getPhoneNumber();
            }
        }
        return null;
    }
}

