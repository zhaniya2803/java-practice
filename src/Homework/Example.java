package Homework;

public class Example {
    double calculateRentalPrice(String model, int days) {
        double service = 0;
        switch (model) {
            case "Эконом":
                return 10000 * days;
            case "Бизнес":
                return 15000 * days;
            case "Премиум":
                return 25000 * days;
            default:
                return -1;
        }
    }

    double calculateDeliveryCost(String region) {
        switch (region) {
            case "Город":
                return 0 ;
            case "Ближний регион":
                return 5000;
            case "Дальний регион":
                return 10000;
            default:
                return -1;
        }
    }

    double calculateTax(String region, double price) {
        switch (region) {
            case "Город":
                return price * 0.12;
            case "Ближний регион":
                return price * 0.10;
            case "Дальний регион":
                return price * 0.08;
            default: return 0;
        }

    }

    double processRentalOrder(String model, int days, String region) {
        double rentPrice = calculateRentalPrice(model, days);
        double deliveryCost = calculateDeliveryCost(region);
        double total = rentPrice + deliveryCost;
        double tax =  calculateTax(region, total);
        total += tax;
        if (days >= 7 && days <= 14) {
            total *= 0.95;
        } else if (days <= 14) {
            total *= 0.9;
        } else return 0;
        return total;
    }

}
