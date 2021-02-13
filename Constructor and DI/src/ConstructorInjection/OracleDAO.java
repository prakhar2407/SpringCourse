package ConstructorInjection;

public class OracleDAO implements DAO {
    int x;

    public OracleDAO() {
        System.out.println("Oracle Default Cons Call");
    }

    public OracleDAO(int x) {
        this.x = x;
        System.out.println("I am Param Cons Call");
    }

    public OracleDAO(String y, int z) {
        System.out.println("I am 2 Param Cons Call " + y + " " + z);
    }

    @Override
    public void create() {
        System.out.println("Oracle ConstructorInjection.DAO Create X is " + x);
// TODO Auto-generated method stub
    }

//    @Override
//    public void delete() {
//
//    }
//
//    @Override
//    public void update() {
//
//    }
//
//    @Override
//    public void read() {
//
//    }
}


