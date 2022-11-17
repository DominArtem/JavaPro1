package main.com.hillel.domin.homework.homework1;

public class Employee {

    private String name;
    private String surname;
    private String patronymic;
    private String position;
    private String email;
    private String telephone;
    private int age;

    public Employee(String name, String surname, String patronymic, String position, String email, String telephone, int age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", patronymic='" + patronymic + '\'' +
//                ", position='" + position + '\'' +
//                ", email='" + email + '\'' +
//                ", telephone='" + telephone + '\'' +
//                ", age=" + age +
//                '}';
//    }



        public String peopleWork (){

            return name + " " + surname + " " + patronymic + " " + "holds the post " + position + "in" + age;

        }

        public String peopleEmail(){

            return name + " " + surname + " " + patronymic + " " + "created email " + email;

        }

        public String peopleTelephon(){

            return name + " " + surname + " " + patronymic + " " + "issued a phone number " + telephone;

        }
}
