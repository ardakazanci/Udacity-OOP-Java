public class MainClass {


    // Alternatif Çözüm Yolu

    /*

    public static void main(String [] args){
   // Create the ContactsManager object
   ContactsManager myContactsManager = new ContactsManager();
   // Create a new Contact object for James
   Contact friendJames = new Contact();
   // Set the fields
   friendJames.name = "James";
   friendJames.phoneNumber = "0012223333";
   // Add James Contact to the ContactsManager
   myContactsManager.addContact(friendJames);
   // Create a new Contact object for Cezanne
   Contact friendCezanne = new Contact();
   // Set the fields
   friendCezanne.name = "Cezanne";
   friendCezanne.phoneNumber = "987654321";
   // Add Cezanne Contact to the ContactsManager
   myContactsManager.addContact(friendCezanne);
   // Create a new Contact object for Jessica
   Contact friendJessica = new Contact();
   // Set the fields
   friendJessica.name = "Jessica";
   friendJessica.phoneNumber = "5554440001";
   // Add Jessica Contact to the ContactsManager
   myContactsManager.addContact(friendJessica);

   // Now let's try to search of a contact and display their phone number
   Contact result = myContactsManager.searchContact("Jessica");
   System.out.println(result.phoneNumber);

}


     */

    public static void main(String[] args) {

        ContactManager myContactManager = new ContactManager();
        Contact myFriendOne = new Contact();
        Contact myFriendTwo = new Contact();
        Contact myFriendThree = new Contact();
        Contact myFriendFour = new Contact();


        myFriendOne.name = "Arda";
        myFriendOne.phoneNumber = "000000000";
        myFriendOne.email = "arda@anadolu.edu.tr";

        myFriendTwo.name = "Kerem";
        myFriendTwo.phoneNumber = "111111111";
        myFriendTwo.email = "kerem@anadolu.edu.tr";

        myFriendThree.name = "Aslı";
        myFriendThree.phoneNumber = "222222222";
        myFriendThree.email = "asli@anadolu.edu.tr";

        myFriendFour.name = "Mehmet";
        myFriendFour.phoneNumber = "33333333";
        myFriendFour.email = "mehmet@anadolu.edu.tr";




        myContactManager.addContact(myFriendOne);
        myContactManager.addContact(myFriendTwo);
        myContactManager.addContact(myFriendThree);
        myContactManager.addContact(myFriendFour);


        Contact friend1 = myContactManager.searchContact(myFriendOne.name);
        Contact friend2 = myContactManager.searchContact(myFriendTwo.name);
        Contact friend3 = myContactManager.searchContact(myFriendThree.name);
        Contact friend4 = myContactManager.searchContact(myFriendFour.name);

        System.out.println("-----------------------");
        System.out.println("Friend name : "+ friend1.name);
        System.out.println("Friend phone : "+friend1.phoneNumber);
        System.out.println("-----------------------");

        System.out.println("Friend name : "+ friend2.name);
        System.out.println("Friend phone : "+friend2.phoneNumber);
        System.out.println("-----------------------");

        System.out.println("Friend name : "+ friend3.name);
        System.out.println("Friend phone : "+friend3.phoneNumber);
        System.out.println("-----------------------");

        System.out.println("Friend name : "+ friend4.name);
        System.out.println("Friend phone : "+friend4.phoneNumber);
        System.out.println("-----------------------");



    }

}
