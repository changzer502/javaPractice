package test;

/**
 * @author lingqu
 * @date 2022/4/2
 * @apiNote
 */
public class FU {
     String name;

     FU(String name) {
        this.name = name;
    }
}

class ZI extends FU {
    private String sex;
    private String name;

    ZI(String sex) {
        super("a");
        this.sex = sex;
    }
    public String tt(){
        super.name="";
        return "";
    }
}
