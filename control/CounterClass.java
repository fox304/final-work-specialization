package control;

public class CounterClass implements AutoCloseable{
    private static Integer counter = 0;
    public void add(){
        counter++;
    }
    public Integer getCount(){
        return counter;
    }

    @Override
    public void close() throws Exception {

    }
}
