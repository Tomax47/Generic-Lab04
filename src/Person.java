import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

import java.util.Comparator;

public class Person implements Comparable<Person>{
    private String name;
    private String surname;
    private LocalDate birthday;
    private char gender;

    //Getting the value of each of the data entered
    public String getName(){
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public LocalDate getBirthDay(){return birthday;}
    public char getGender() {return gender;}


    //Setting the data
    public void setGender(char gender) {
        if (gender == 'm' || gender == 'M'|| gender == 'f' || gender == 'F') {this.gender = gender;}
    }
    public String setName(String name) {this.name=name; return this.name;}
    public String setSurname(String surname) {this.surname=surname; return this.surname;}
    public LocalDate setBirthDay(LocalDate birthDay) {this.birthday=birthDay; return this.birthday;}


    //Entering the data
    public void readPerson() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Name : ");
        name = scan.nextLine();
        System.out.print("Surname : ");
        surname = scan.nextLine();
        System.out.print("BirthDay : ");
        birthday = LocalDate.parse(scan.nextLine());
        System.out.print("Gender : ");
        setGender(scan.nextLine().charAt(0));
    }

    //If empty data set to default
    public Person() {
        name = surname = "Null";
        birthday = LocalDate.now();
        gender = 'M';
    }

    //If data added, then set the data
    public Person(String name, String surname, LocalDate birthDay, char gender) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthDay;
        this.gender = gender;
    }

    //Compiling the data into a string
    public String toString() {
        System.out.println("\nName : "+name +"\nSurname : "+surname+"\nBirthDay : "+birthday+"\nGender : "+gender);
        return name+gender+surname+birthday;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        if (birthday != null && currentDate != null) {
            return Period.between(birthday,currentDate).getYears();
        } else {
            return 0;
        }
    }

    @Override
    public int compareTo(Person person) {
        String firstName = name;
        String secondName = person.getName();

        int b = firstName.compareTo(secondName);
        return b;
    }


}
