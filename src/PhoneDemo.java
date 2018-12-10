/**
 * Created by Student on 10.12.2018.
 */
public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1= new Phone();
        Phone phone2= new Phone();
        Phone phone3= new Phone();

        phone1.number = "+380990000762";
        phone1.model = "Xiaomi Redmi Note 5";
        phone1.weight = 300;

        System.out.println(phone1.number +" "+ phone1.model+ " " + phone1.weight);
        phone1.receiveCall("Nikita");
        System.out.println(phone1.getNumber());
    }
}
