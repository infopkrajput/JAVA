package Unit8;

public class Str {
    private char []t = new char[20];
    public Str(){
        this.t[0] = ' ';
    }
    public Str(String st){
        // placeholder constructor
    }
    @Override
    public String toString() {
        return new String(t).trim();
    }
}
