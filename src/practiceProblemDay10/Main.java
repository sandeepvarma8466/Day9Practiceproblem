package practiceProblemDay10;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        AddressBook adressBook = new AddressBook();
        System.out.println(adressBook.getFirstName());
        adressBook.setFirstName("Dubyala");
        System.out.println(adressBook.getFirstName());
        System.out.println(adressBook.getLastName());
        adressBook.setLastName("sandeep");
        System.out.println(adressBook.getLastName());
        System.out.println(adressBook.getAddress());
        adressBook.setAddress("2-49");
        System.out.println(adressBook.getAddress());
        System.out.println(adressBook.getCityName());
        adressBook.setCityName("Warangal");
        System.out.println(adressBook.getCityName());
        System.out.println(adressBook.getStateName());
        adressBook.setStateName("Telangana");
        System.out.println(adressBook.getStateName());
        System.out.println(adressBook.getPhoneNum());
        adressBook.setPhoneNum(1234567892);
        System.out.println(adressBook.getPhoneNum());
        System.out.println(adressBook.getZipCode());
        adressBook.setZipCode(506555);
        System.out.println(adressBook.getZipCode());

        //
        AddressBook addressBook1=  adressBook.clone();
        AddressBook addressBook2 = adressBook.clone();
        System.out.println(adressBook.getFirstName());
        System.out.println(addressBook1.getFirstName());

        //addressBook1.setFirstName("Varma");
        System.out.println(adressBook.getFirstName());
        System.out.println(addressBook1.getFirstName());

        addressBook2.setFirstName("ddddd");
        System.out.println(adressBook.getFirstName());
        System.out.println(addressBook2.getFirstName());

        System.out.println(adressBook);

        System.out.println(adressBook.equals(addressBook1));
        System.out.println(adressBook.getClass());

        //1person -> multiple adresses
        HashMap<String, ArrayList<AddressBook>>map = new HashMap<>();
        ArrayList<AddressBook> arrayList = new ArrayList<>();
        arrayList.add(adressBook);
        map.put("Ram",arrayList);

        System.out.println(map);
        if (map.containsKey("Ram")) {
            ArrayList<AddressBook>ram=map.get("Ram");
            ram.add(addressBook1);
            map.put("Ram",ram);
        }
        System.out.println(map);

       // map.entrySet().forEach(v->System.out.println(v.getKey()+":"+v.getKey().toString()));
    }
}
