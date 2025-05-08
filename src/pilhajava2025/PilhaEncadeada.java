package pilhajava2025;

public class PilhaEncadeada<T> {
    private No<T> topo;
    private int qtd;
    
    public PilhaEncadeada(){
        this.topo = null;
        this.qtd=0;
    }
    
    public boolean push(T dado){
        No<T> novoNo = new No();
        if(novoNo==null) // nao conseguiu alocar
            return false;
        novoNo.setDado(dado);
        novoNo.setProximo(topo);
        this.topo = novoNo;
        this.qtd++;
        return true;
    }
    
    public boolean isEmpty(){
           return this.topo == null;
    }
    
    public T pop(){
       if(!isEmpty()){
           T dado = this.topo.getDado();
           this.topo = this.topo.getProximo();
           this.qtd--;
           return dado;
       }
       else
        return null;
    }
    public T peek(){
       if(!isEmpty()){
           return this.topo.getDado();
       }
       else
        return null;
    }
    
    @Override
    public String toString(){
        StringBuilder retorno =
                new StringBuilder("Topo\n");
        No<T> aux = this.topo;
        while(aux!=null){
            retorno.append(aux.getDado()+"\n");
            aux = aux.getProximo();
        }
        return retorno.toString();
    }
    
    
}
