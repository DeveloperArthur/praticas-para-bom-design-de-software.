package br.com.arthur.principles.designpatterns.mediator.solucao;

import java.util.ArrayList;
import java.util.List;

public class MensagemMediator implements Mediator {
    protected List<Colleague> colleagues;

    public MensagemMediator() {
        this.colleagues = new ArrayList<>();
    }

    @Override
    public void envia(String mensagem, Colleague colleague) {
        colleagues.forEach(contatoIterator -> {
            if (contatoIterator != colleague) {
                definirProtocolo(contatoIterator);
                contatoIterator.enviaMensagem(mensagem);
            }
        });
    }

    @Override
    public void adicionarColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    private void definirProtocolo(Colleague colleague) {
        if (colleague instanceof IOSColleague) {
            System.out.println("Protocolo IOS");
        } else if (colleague instanceof AndroidColleague) {
            System.out.println("Protocolo Android");
        } else if (colleague instanceof BlackBerryColleague) {
            System.out.println("Protocolo BlackBerry");
        }
    }
}
