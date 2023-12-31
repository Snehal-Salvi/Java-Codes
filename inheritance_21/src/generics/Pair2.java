package generics;
//class with multiple generic type means if we want to specify two different types 
public class Pair2<T,S> {

	    private T first;
	    private S second;

	    public Pair2(){}

	    public Pair2(T first, S second){
	      this.first = first;
	      this.second = second;
	    }

	    public T getFirst(){
	        return first;
	    }

	    public void setFirst(T first){
	        this.first=first;
	    }

	    public S getSecond(){
	      return second;
	    }

	    public void setSecond(S second){
	      this.second= second;
	    }
	}


