public class ArvoreBinaria {

    private No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(int conteudo) {
        No novoNo = new No(conteudo);
        No pai;
        if(raiz == null) {
            raiz = novoNo;
        } else {
            No atual = raiz;
            while(true) {
                pai = atual;
                if(novoNo.getConteudo() <= atual.getConteudo()) {
                    atual = atual.getEsquerda();
                    if(atual == null) {
                        pai.setEsquerda(novoNo);
                        return;
                    }
                } else {
                    atual = atual.getDireita();
                    if(atual == null) {
                        pai.setDireita(novoNo);
                        return;
                    }
                }
            }

        }
    }

    public void preOrdem(No no) {
        if(no == null) {
            return;
        }
        System.out.println(no.getConteudo());
        preOrdem(no.getEsquerda());
        preOrdem(no.getDireita());
    }

    public void emOrdem(No no) {
        if(no == null) {
            return;
        }
        emOrdem(no.getEsquerda());
        System.out.println(no.getConteudo());
        emOrdem(no.getDireita());
    }

    public void posOrdem(No no) {
        if(no == null) {
            return;
        }
        posOrdem(no.getEsquerda());
        posOrdem(no.getDireita());
        System.out.println(no.getConteudo());
    }

    public void remover(int conteudo) {
        raiz = removerRecursivo(raiz, conteudo);
    }

    private No removerRecursivo(No raizSubarvore, int conteudo) {
        if (raizSubarvore == null) {
            return raizSubarvore;
        }

        if (conteudo < raizSubarvore.getConteudo()) {
            raizSubarvore.setEsquerda(removerRecursivo(raizSubarvore.getEsquerda(), conteudo));
        }

        else if (conteudo > raizSubarvore.getConteudo()) {
            raizSubarvore.setDireita(removerRecursivo(raizSubarvore.getDireita(), conteudo));
        }

        else {
            if (raizSubarvore.getEsquerda() == null) {
                return raizSubarvore.getDireita();
            } else if (raizSubarvore.getDireita() == null) {
                return raizSubarvore.getEsquerda();
            }

            raizSubarvore.setConteudo(encontrarMenorValor(raizSubarvore.getDireita()));
            raizSubarvore.setDireita(removerRecursivo(raizSubarvore.getDireita(), raizSubarvore.getConteudo()));
        }
        return raizSubarvore;
    }

    private int encontrarMenorValor(No raizSubarvore) {
        return raizSubarvore.getEsquerda() == null ? raizSubarvore.getConteudo() : encontrarMenorValor(raizSubarvore.getEsquerda());
    }

    public No getRaiz() {
        return raiz;
    }
}

