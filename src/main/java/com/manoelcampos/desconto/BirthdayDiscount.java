package com.manoelcampos.desconto;

import java.time.LocalDate;

public class BirthdayDiscount implements DiscountEstrategy {

    @Override
    public double calculateTax(Venda venda) {
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataNascimentoCliente = venda.getCliente().getDataNascimento();
        if (dataNascimentoCliente != null && dataNascimentoCliente.getMonth() == dataAtual.getMonth() &&
                dataNascimentoCliente.getDayOfMonth() == dataAtual.getDayOfMonth()) {
            var discount = venda.getValorTotal() * 15 / 100;
            System.out.println("Valor do desconto de aniversário "+ discount);
            return discount;
        } else {
            System.out.println("Valor do desconto de aniversário zeradoo");
            return 0;
        }
    }
}
