package com.manoelcampos.desconto;

import java.time.LocalDate;

public class SalesSystem {
    public static void main(String[] args) {
        var cliente = new Cliente(1,"Eliel Oliveira Viana", LocalDate.of(2023, 5, 24));
        var venda = new Venda(1,cliente,LocalDate.of(1998, 8, 16),1000);
        System.out.println("Valor total da venda R$"+venda.getValorTotal());

        new ProgressiveDiscount().calculateTax(venda);
        new BirthdayDiscount().calculateTax(venda);
        new SetDiscount(30).calculateTax(venda);
    }
}
