/*        1. Үй-булөлөр өз үйүндө, батирде жана мейманканада жашашат.
        2. Өз үйүндө жашагандар ком услуга төлөшөт (5 адам жашайт)
        3. Батир менен гостиницада жашагандар квартплата + ком услуга төлөшөт (3 адам жашайт)
        4. Мейманканада жашагандар номерге төлөшөт (2 адам жашайт)
        5. Кайсы жерде канча адам жашаганын жана канча чыгым болгонун консольго чыгарыңыз
        PS: кыймыл аракеттерди интерфейс аркылуу реализация кыласыздар,
        жашаган жерлери бул класстар, үй-бүлө бул массив, адам бул класс.*/
public class Main {
    public static void main(String[] args) {

        Services home = new Home("Father", "Mather", "Son", "Daughter", "Grandson");
        Services[] servHome = new Services[]{home};
        for (Services s : servHome) {
            System.out.println("Home: " + s + ",\nExpenses: " + home.services() + " = " + (home.services() / 5) );
        }
        System.out.println(" ");
        Services apartment = new Apartment("Sasha", "Masha", "Dasha");
        Services[] servApart = new Services[]{apartment};
        for (Services s : servApart) {
            System.out.println("Apartment: " + s + ",\nExpenses: " + apartment.services() + " = " + (apartment.services() / 3));
        }
        System.out.println(" ");
        Services hotel = new Hotel("Bob", "Sab");
        Services[] servHotel = new Services[]{hotel};
        for (Services s : servHotel) {
            System.out.println("Hotel: " + s + ",\nExpenses: " + hotel.services() + " = " + (hotel.services() / 2));
        }


    }
}