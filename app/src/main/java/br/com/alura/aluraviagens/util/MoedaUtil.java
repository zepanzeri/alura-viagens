package br.com.alura.aluraviagens.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class MoedaUtil {

    public static final String PORTUGES = "pt";
    public static final String BRASIL = "br";
    public static final String FORMATO_PADRAO = "R$";
    public static final String FORMATO_DESEJADO = "R$ ";

    public static String formataParaBrasileiro(BigDecimal valor) {
        NumberFormat formatoBrasileiro = DecimalFormat
                .getCurrencyInstance(new Locale(PORTUGES, BRASIL));
        String moedaBrasileira = formatoBrasileiro
                .format(valor)
                .replace(FORMATO_PADRAO, FORMATO_DESEJADO);
        return moedaBrasileira;
    }
}
