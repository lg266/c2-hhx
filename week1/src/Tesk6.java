class Acount{
    private String name;
    private double balance;
    public Acount(String name,double balance){
        this.name=name;
        this.balance=balance;
    }
    public String search(){
        return "帐户名称："+name+",帐户余额："+balance;
    }
}
public class Tesk6{
    public static void main(String[] args){
        Acount a=new Acount("001",2000.0);
        System.out.println(a.search());
    }
}