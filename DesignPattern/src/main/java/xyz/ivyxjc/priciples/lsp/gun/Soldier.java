package xyz.ivyxjc.priciples.lsp.gun;


/**
 * Created by ivyxjc on 2016/10/24.
 */
public class Soldier {
    private AbstractGun gun;

    //给士兵枪
    public void setGun(AbstractGun gun){
        this.gun=gun;
    }

    public void killEnenmy(){
        System.out.println("Kill Enemy......");
        gun.shoot();

    }
}
