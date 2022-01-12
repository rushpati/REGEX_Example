import java.util.LinkedList;
import java.util.List;

public class Text<H> {

    private H val ;
    public Text(H t){
        this.val =t;
    }

    @Override
    public String toString() {
        return "[" + val + "]";
    }

    public static void main(String[] args) {
        List list = new LinkedList<>();
        list.add("1");
        list.add("1dfs");
        list.add("1fs");
        list.add("1235");

    }

}
