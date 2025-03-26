
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
    
    
}
