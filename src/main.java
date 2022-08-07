class Main {
    public static void main(String[] args) {

        int price = 35000 ; //стоимость билета

        int milePrice = 20 ; //стоимость 1 мили
        int MilesEarned = (price / milePrice);

        System.out.println(price + " стоимость билета ") ;
        System.out.println(MilesEarned + " начислено миль за покупку билета ") ;
    }
}