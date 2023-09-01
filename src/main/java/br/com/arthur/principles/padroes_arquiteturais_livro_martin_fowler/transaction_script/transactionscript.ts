/*
O padrão Transaction Script é um padrão de projeto de software que lida com a lógica de negócios 
de uma aplicação por meio de scripts que representam transações individuais. 

Ele é frequentemente usado em sistemas onde a lógica de negócios é relativamente simples e direta
sem muita complexidade. Esse padrão é especialmente adequado para aplicativos que têm uma grande 
quantidade de operações independentes que não precisam ser gerenciadas de forma mais abstrata.

Aqui estão alguns conceitos chave do padrão Transaction Script:

- Transação Individual: Cada script de transação trata de uma única operação ou transação dentro do sistema. 
Essa transação pode envolver a atualização, leitura ou manipulação dos dados em uma única unidade.

- Lógica de Negócios em Scripts: Ao invés de separar a lógica de negócios em várias camadas 
(como Model-View-Controller ou camadas de serviço), a lógica de negócios é encapsulada dentro de cada 
script de transação. Isso significa que a lógica está diretamente incorporada nos scripts que manipulam os dados.

- Simplicidade: O padrão Transaction Script é mais adequado para cenários onde a lógica de negócios é 
relativamente simples, sem muita complexidade. Para aplicações complexas, outros padrões como o padrão 
Domain Model ou o padrão Service Layer podem ser mais apropriados.

- Baixa Abstração: Esse padrão não se preocupa muito com a criação de abstrações complexas. 
A ênfase está na implementação direta das transações.

- Fácil Manutenção: Como cada transação é tratada em um script separado, a manutenção pode ser 
relativamente direta. Mudanças na lógica de negócios de uma transação específica podem ser feitas sem 
afetar outras partes do sistema.



Então pensando em uma API Rest, usando o padrão Transaction Script, a lógica de negócios é implementada de
forma procedural, muitas vezes diretamente no controlador ou na camada que lida com as rotas da API. 
Não há uma abstração significativa das regras de negócios em objetos ou camadas separadas, como é feito em 
outros padrões como o padrão Service Layer ou Domain Model, ou seja dentro do controller terá toda a lógica, 
acesso a dados, sem abstração nenhuma, sem encapsulamento nenhum, apenas o código procedural, sem objetos

Não haveria uma camada intermediária de serviço que encapsula a lógica de negócios mais complexa. 
Isso pode resultar em código mais procedural, com todas as operações sendo tratadas em sequência 
dentro dos scripts de transação.

Em cenários simples, o padrão Transaction Script pode ser uma escolha viável, mas em sistemas mais complexos
pode ser mais benéfico adotar abstrações mais estruturadas, pois o padrão Transaction Script pode ser útil para 
cenários simples e diretos, mas ele pode se tornar problemático à medida que a complexidade da aplicação aumenta. 
A falta de abstração pode levar a dificuldades de manutençãocódigo duplicado e falta de reutilização de código. 

Portanto, em sistemas mais complexos, é mais comum recorrer a abordagens que separam a lógica de negócios 
em camadas mais definidas, como o padrão Service Layer, onde as regras de negócios são encapsuladas em 
serviços independentes, ou o padrão Domain Model, onde os objetos de domínio representam conceitos do mundo real.



O código abaixo é um exemplo de Transaction Script 
*/

export default class ParkingService {
    parkedCars: any = {};

    constructor() {

    }

    async checkin (plate: string, checkinDate: Date) {
        if (!plate.match(/[A-Z]{3}[0-9]{4}/)) throw new Error("Invalid plate");
        this.parkedCars[plate] = { plate, checkinDate };
    }

    async checkout (plate: string, checkoutDate: Date) {
        const parkedCar = this.parkedCars[plate];
        if (!parkedCar) throw new Error("Parked car not found");
        const duration = (checkoutDate.getTime() - parkedCar.checkinDate.getTime()) / (1000 * 60 * 60);
        const price = duration * 10;
        return {
            price
        }
    }
}

/*
Pois há duas funções principais: checkin e checkout, que representam transações individuais 
dentro de um sistema de estacionamento. Aqui estão as características que tornam esse 
código um exemplo de Transaction Script:

- Lógica de Negócios em Scripts Separados: As operações de checkin e checkout são tratadas como scripts separados
onde cada um lida com uma única transação (entrada ou saída de um carro do estacionamento).

- Procedural e Direto: A lógica dentro desses scripts é mais direta e procedural. O foco está nas operações 
sequenciais que precisam ser realizadas para concluir cada transação.

- Acesso a Dados Simplificado: Os dados são armazenados em um objeto chamado parkedCars, que é um repositório 
simples para manter as informações dos carros estacionados.

- Ausência de Abstração Complexa: Não há camadas distintas de serviço ou classes de domínio altamente abstraídas. 
A lógica de negócios é implementada dentro desses scripts de transação.

- Regras de Negócios Diretas: A lógica de cálculo de preço com base na duração de estacionamento é diretamente 
incorporada no script checkout.



Qualquer bloco de código procedural que não abstrai dados em objetos, não segue princípios de design orientado
a objetos e não organiza a funcionalidade em classes ou módulos pode ser considerado Transaction Script 
porém depende, por exemplo, o código abaixo NÃO é um Transaction Script:
*/

function calcularSalarioLiquido(salarioBruto: number, taxaImpostos: number): number {
    const descontoImpostos: number = salarioBruto * taxaImpostos;
    const salarioLiquido: number = salarioBruto - descontoImpostos;
    return salarioLiquido;
}

/*
É uma função que realiza um cálculo simples do salário líquido com base no salário bruto e na taxa de impostos. 
Embora seja procedural e direto, ele não se encaixa na definição de um Transaction Script porque não está tratando 
de uma transação ou operação de negócios específica. Em vez disso, ele está executando uma tarefa matemática simples.

O Transaction Script, como mencionado anteriormente, é uma abordagem que lida com transações individuais ou operações
de negócios específicas. Sua função é mais apropriada para operações mais complexas, como processamento de pedidos
manipulação de transações financeiras, etc., onde há um conjunto de ações coordenadas a serem executadas.

Portanto, ter um bloco de código procedural ou uma parte do código que usa um estilo mais procedural não torna 
automaticamente essa parte um Transaction Script, a menos que ela seja projetada para lidar com transações individuais 
simples de forma direta e sequencial. 

Mas supondo que eu tenha meu projeto inteiro onde eu uso abstração de dados em objetos, sigo princípios 
de design orientado a objetos e organizo a funcionalidade em classes, eu posso ter um Transaction Script em 
algum lugar especifico do meu código sim.



Transaction Script pode ser considerado um "code smell" (sinal de código problemático) em muitos cenários
especialmente em aplicações mais complexas. Embora o padrão Transaction Script possa ser apropriado para 
situações simples e diretas, ele pode levar a problemas à medida que a complexidade da aplicação aumenta. 
Alguns dos problemas associados ao padrão Transaction Script incluem:

- Falta de Abstração: Como mencionado anteriormente, o padrão Transaction Script tende a não fornecer abstrações 
claras, o que pode dificultar a compreensão e a manutenção do código à medida que ele cresce.

- Duplicação de Código: A lógica de negócios que é implementada em cada script de transação pode facilmente 
levar a duplicações de código, à medida que as mesmas regras de negócios são implementadas em vários lugares.

- Dificuldade de Manutenção: A medida que a aplicação cresce, a lógica de negócios se espalha por diferentes 
partes do código, tornando difícil fazer mudanças ou atualizações sem afetar várias partes do sistema.

- Falta de Reutilização de Código: Como não há uma separação clara entre a lógica de negócios e outras partes 
da aplicação, a reutilização de código se torna mais difícil.

- Dificuldade em Testes Unitários: Testar partes individuais da lógica de negócios pode ser complicado quando 
ela está fortemente acoplada ao restante do código.

- Dificuldade em Evoluir: À medida que novos requisitos e funcionalidades são adicionados, a falta de abstração 
pode dificultar a evolução da aplicação de forma coerente.



Geralmente dizem que devemos escolher entre TransactionScript e Domain Model, isso porque no Domain Model 
nossas classes de domínio espelham tabelas do banco de dados, e são modelos ricos, tem validações, tem regras 
de negócio encapsulados, e o Transaction Script não utiliza objetos, é procedural.



Em resumo, o padrão Transaction Script é uma abordagem específica, simples e direta para lidar com a 
lógica de negócios em sistemas menos complexos, onde a lógica de negócios é tratada como scripts 
individuais, cada um cuidando de uma transação, é uma abordagem que se concentra na implementação 
direta e sequencial de transações ou operações de negócios.

Transaction Script é em essência, uma abordagem procedural direta para implementar a lógica de 
negócios, onde as operações são tratadas como scripts ou funções e não envolvem uma estruturação 
elaborada em termos de objetos ou classes, é uma abordagem específica onde a lógica de negócios 
é tratada como scripts individuais cada um cuidando de uma transação.
*/