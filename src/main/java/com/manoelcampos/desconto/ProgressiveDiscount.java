package com.manoelcampos.desconto;

public class ProgressiveDiscount implements DiscountEstrategy{
    @Override
    public double calculateTax(Venda venda) {
        double percentualDesconto = Math.min(venda.getValorTotal() / 25, 20);
        var discount = venda.getValorTotal() * percentualDesconto / 100;
        System.out.println("Valor do desconto progressivo "+ discount);
        return discount;
    }
}
