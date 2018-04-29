
// Kişi ekleme ve aramadan sorumlu sınıfımız.


public class ContactManager {

    Contact[] myFriends; // Contact sınıfınından bir dizi oluştur.
    int friendsCount;

    ContactManager() {

        this.friendsCount = 0; // Başlangıç indis değeri
        this.myFriends = new Contact[500]; // Eklenebilecek kişi sayısı sınırı

    }

    // Contact dizisine contact nesnesi ekleyecek. FriendsCount 1 arttırılacak.
    // 0 ' dan başlayarak ekleme sağlanacak.
    // 1 . 2. .3. .4. ... gibi artacak.

    void addContact(Contact contact) {

        myFriends[friendsCount] = contact;
        friendsCount++;

    }


    Contact searchContact(String searchName) {

        for (int i = 0; i < friendsCount; i++) {

            if (myFriends[i].name.equals(searchName)) {

                 return myFriends[i]; // Contact nesnesi dönecek.

            }

        }

        return null;


    }

}
