package com.manoelcampos.desconto;

public class SetDiscount implements DiscountEstrategy {
    private final double discountPercentage;

    public SetDiscount(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculateTax(Venda venda) {
        var discount = venda.getValorTotal() * discountPercentage / 100;
        System.out.println("Valor do desconto definidio: "+ discount);
        return discount;
    }
}
