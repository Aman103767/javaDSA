package generatic;

public class MyGen <T>{
    T data;

    public MyGen(T data){
        this.data = data;
    }
    public T getData(){
        return data;
    }
}
