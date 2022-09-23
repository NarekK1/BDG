import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.asList;

public class Phonebook {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Phonebook pb = new Phonebook();
        ArrayList<Contact> c;

        Scanner sc = new Scanner(System.in);
    }


    public class Contact {
        String firstName;
        String lastName;
        String number;

        Contact(String firstName, String lastName, String number) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.number = number;
            firstName = sc.next();
            lastName = sc.nextLine();
            number = sc.nextLine();

        }

        public boolean getContact() {
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            System.out.print("Enter contact name to get it" + name);
            this.firstName = firstName;
            this.lastName = lastName;
            this.number = number;
            getContact();
            if (firstName.isEmpty()) {
                System.out.print("Name is empty");
            }
            if (lastName.isEmpty()) {
                System.out.print("Surname is empty");
            }
            if (number.isEmpty()) {
                System.out.print("Number is empty");
            }
            if (getContact()) {
                if (number.charAt(0) == '0' && number.length() > 12) {
                    System.out.print("The number is too short");
                }
                System.out.println(firstName);
                System.out.println(lastName);
                System.out.println(number);

            }
            return false;
        }

        public void add() {
        }

        public void addContact() {
            Scanner sc = new Scanner(System.in);
            String firstName = sc.next("Enter name");
            String lastName = sc.next("Enter lastname");
            String number = sc.next("Enter number");
            Contact a = new Contact(firstName, lastName, number);
            a.add();

            if (number.charAt(0) == '0' && number.length() > 12) {
                System.out.print("The number is too short");
            }

        }

        public boolean deleteContact() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Type to delete contact");
            String firstName = sc.next();
            String lastName = sc.next();
            String number = sc.next();
            String[] surname = lastName.split("");
           String[] name = firstName.split("");
            String[] num = number.split("");
            List<String> m = new ArrayList<String>(asList(name));
            List<String> n = new ArrayList<String>(asList(surname));
            List<String> r = new ArrayList<String>(asList(num));
            if(deleteContact()){
                m.clear();
                n.clear();
                r.clear();
            }
            return false;
        }
         public boolean editContact() {
            String firstName = sc.next();
            String lastName = sc.next();
            String number = sc.next();
            if(editContact()) {

            }
             return false;
         }

    }
}
