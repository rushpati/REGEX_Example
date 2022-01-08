import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.*;
import java.util.stream.Stream;

class Trade{

    private int id;
    private  String tradeName;
    private  double tradeValue;


    Trade(){}
    Trade(int id, String tradeName,double tradeValue){
        this.id=id;
        this.tradeName= tradeName;
        this.tradeValue= tradeValue;
    }
    @Override
    public String toString() {
        return "Trade{" +
                "id=" + id +
                ", tradeName='" + tradeName + '\'' +
                ", tradeValue=" + tradeValue +
                '}';
    }

}

class Outer{
    private String s;

    class Inner{
        public void test(){
            System.out.println(s);
        }
    }
}

public class RegexExample {

    RegexExample(){
        return;
    }
    public static void main(String[] args) throws Exception {


  List emplist = new ArrayList();
        emplist.add(new Trade(1,"emea",6899.1));
        emplist.add(new Trade(3,"qpqd",9932.1));
        emplist.add(new Trade(6,"apac",683.1));
        emplist.add(new Trade(2,"global",932.1));
        /*Stream.of(emplist).forEach(a -> System.out.println(a));*/
        Stream s1 = Stream.of(emplist);
        System.out.println(s1);

        
        HashMap hm = new HashMap();

        hm.put("one",new Integer(1));
        hm.put(null,"two");
        hm.put(null,"three");
        /*hm.entrySet().stream().forEach(s -> {System.out.println(s.hashCode());
            System.out.println(s);}
        );

         */


    }

}
