
package pilhajava2025;

public class Pilha<T> {
    private T[] elementos;
    private int topo;
    
    public Pilha(int tamanho){
        this.elementos = (T[]) new Object[tamanho];
        this.topo = -1;
    }
    public boolean isEmpty(){
        return this.topo == -1;
        
       /* if(this.topo == -1)
            return true;
        else
            return false;*/
    }
    
    public boolean isFull(){
        return this.topo == this.elementos.length -1;
    }
    
    
    public boolean push(T dado){
        if(!this.isFull()){
            this.elementos[++this.topo] = dado;
            return true;
        }// fim if
        return false;
    }
    
    @Override
    public String toString(){
        
        StringBuilder retorno =
                new StringBuilder("Topo\n");
        for(int i = this.topo ; i>=0; i--)
            retorno.append(this.elementos[i]+"\n");
        
        return retorno.toString();
    }
    
}
