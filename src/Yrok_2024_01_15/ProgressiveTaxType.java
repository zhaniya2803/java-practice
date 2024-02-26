package Yrok_2024_01_15;

import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxTape{
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        int result = amount.compareTo(BigDecimal.valueOf(100_000));
        if (result <= 0) {
            return amount.multiply(BigDecimal.valueOf(0.1));
        }
        return amount.multiply(BigDecimal.valueOf(0.15));
    }
}
