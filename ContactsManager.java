public class ContactsManager {
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

