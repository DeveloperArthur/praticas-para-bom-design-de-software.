function Pontuacao(total1, total2){
    this.total1 = total1
    this.total2 = total2
}

export function calcularPontuacao(mes_cargo, mes_lotacao, mes_adjunto, mes_titular, magisterio){
    if(mes_cargo > 0 && mes_lotacao > 0 && mes_adjunto > 0 && mes_titular > 0 && magisterio > 0){        
        var valor_mes_cargo = mes_cargo * 6;
        var valor_mes_lotacao = mes_lotacao * 5;
        var valor_mes_carreira_adjunto = mes_adjunto * 1;
        var valor_mes_carreira_titular = mes_titular * 3;
        var valor_mes_magisterio = magisterio * 0.5;

        var total1 = valor_mes_cargo + valor_mes_lotacao + valor_mes_carreira_adjunto + valor_mes_carreira_titular + valor_mes_magisterio;
        var total2 = valor_mes_cargo + valor_mes_carreira_titular + valor_mes_magisterio;

        return new Pontuacao(total1, total2)
    } else {
        throw new Error("Os valores precisam ser maiores que zero");
    }
}