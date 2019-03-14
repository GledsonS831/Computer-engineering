package bb.edu.ifpb;

public class Conta_Banco
{
    int num;
    String name;
    double balance;
    public Conta_Banco(){
        num = 1;
        name = "User Undefined";
        balance = 100;
    }
    public void setDeposit(double value){
        if(value > 0) {
            balance += value;
        }
    }
    public void setNum(int value){
        num = value;
    }
    public void setName(String name){
        if(name != null) {
            name = name;
        }
    }

    public int getNum() {return num;};
    public double getBalance(){return balance;};
    public String getName(){return name;};

}
