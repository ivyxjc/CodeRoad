package priciples.lsp.gun;

/**
 * Created by yanjiusuo4 on 2016/10/24.
 */
public class Client {
    public static void main(String[] args){
        Soldier soldier=new Soldier();
        soldier.setGun(new Rifle());
        soldier.killEnenmy();
    }
}
