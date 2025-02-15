package BuilderDesignPattern;

public class BuilderDesignPattern {
    public static void main(String[] args) {
        // one style
        Phone phone = new Phone.PhoneBuilder("iOS", "iPhone").build();
        phone.setModelName("iPhone 16 Pro Max");
        System.out.println(phone.toString());

        // second style
        Phone phone2 = new Phone.PhoneBuilder("Android", "Xiaomi")
        .setModelName("redmi")
        .setHeight(1.1f)
        .setLength(2.2f)
        .build();

        System.out.println(phone2.toString());
        System.out.println("is equal?: "+(phone==phone2));

    }
}