public class Example {}
//    double processOrder(String category, String country, double purchase) {
//        // если false завершаем работу метода, выводим сообщение
//        // "в данной категорий товары отсутствуют"
//        if (checkAvailability(category) == false) {
//            System.out.println("в данной категорий товары отсутствуют");
//            return 0.0;
//        } else {
//            double priceAfterDiscount = processDiscount(category, purchase);
//            double deliveryCost = processDelivery(country);
//            double tax = makeTax(country, priceAfterDiscount);
//
//            double total = priceAfterDiscount + deliveryCost + tax;
//            System.out.println("Передали: " + purchase);
//            System.out.println("Стоимость после обработки категорий: " + priceAfterDiscount);
//            System.out.println("Стоимость после обработки доставки: " + deliveryCost);
//            System.out.println("Налог: " + tax);
//            System.out.println("Итого к оплате: " + total);
//            System.out.println("Кэшбек: " + (total * 0.05));
//        }
//    }
//
//
//    double processDiscount(String category, double purchase) {
//        switch (category) {
//            case "смартфоны":
//                return purchase * 0.9;
//            case "ноутбуки":
//                return purchase * 0.8;
//            case "наушники":
//                return purchase * 0.85;
//            default:
//                return purchase;
//        }
//    }
//
//    double processDelivery(String country) {
//        if (!country.equals("США") && !country.equals("КАНАДА")) {
//            return 10;
//        }
//        return 0;
//    }
//
//    double makeTax(String country, double price) {
//        switch (country) {
//            case "США":
//                return price * 0.14;
//            case "КАНАДА":
//                return price * 0.13;
//            default:
//                return price * 0.05;
//        }
//    }
//
//    boolean checkAvailability(String category) {
//        if (category.equals("смартфоны") && category.equals("ноутбуки")) {
//            return true;
//        } else if (category.equals("наушники")) {
//            return false;
//        } else return true;
//        // смартфоны, ноутбуки = товары есть/true
//        // наушники = false
//        // true
//    }
//}
