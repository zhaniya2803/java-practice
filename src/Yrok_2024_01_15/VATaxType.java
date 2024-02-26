package Yrok_2024_01_15;

import java.math.BigDecimal;

public class VATaxType extends TaxTape{
    public BigDecimal calculateTaxFor(BigDecimal amount){
        return amount.multiply(BigDecimal.valueOf(0.18));
    };
}
