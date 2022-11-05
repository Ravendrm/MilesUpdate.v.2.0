public class BonusMilesService {
    public int calculate(int cost) {
                int price = 35000 ; //стоимость билета

                int milePrice = 20 ; //стоимость 1 мили
                int MilesEarned = (price / milePrice);

                System.out.println(price + " стоимость билета ") ;
                System.out.println(MilesEarned + " начислено миль за покупку билета ") ;

        return MilesEarned;
    }

}
