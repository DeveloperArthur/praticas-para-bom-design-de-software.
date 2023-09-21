/* 
O padrão Registry é usado para armazenar e recuperar objetos ou recursos de maneira centralizada

imagina um projeto com as seguintes camadas: 
UI -> Controller -> Service -> Application -> Domain -> Data Access -> Persistence

e na camada de Controller tem um objeto que foi criado, e você precisa desse objeto na camada de Data Access
pra não ter que tráfegar esse objeto em todas as camadas por parâmetro, você pode registrar o objeto na memória
e buscar ele lá na camada que você precisa, pra fazer isso utilizamos o pattern Registry:

O padrão Registry (ou Registro) é mais eficaz quando você tem uma chave (como um identificador único) disponível 
na camada onde deseja recuperar um objeto ou recurso do registro. A chave é usada para indexar e recuperar o 
objeto associado ao registro.

Se a chave não estiver disponível na camada em que você deseja acessar o objeto no registro, você precisará encontrar 
uma maneira de obtê-la ou garantir que ela seja passada como um parâmetro ou argumento de alguma forma.
*/

public class AccountRegistry {
    private static final Map<String, Account> accounts = new HashMap<>();

    public static void registerAccount(String key, Account account) {
        builders.put(key, account);
    }

    public static Account getAccount(String key) {
        return accounts.get(key);
    }
}

//Faremos o registro na camada de Controller
public class AccountController {
    public Response coordena(/*parametros*/){
        //Criação do objeto
        Account account;

        AccountRegistry.registerAccount(account.getId(), account);

        //Restante do código...
    }
}

//Resgatamos o objeto na camada de Data Access
public class AccountDataAccess {
    public Response persiste(/*parametros*/){
        //Restante do código...

        //Diversos campos declarados
        String Cpf;
        String idAccount;

        Account account = AccountRegistry.getAccount(idAccount);

        //Restante do código...
    } 

}