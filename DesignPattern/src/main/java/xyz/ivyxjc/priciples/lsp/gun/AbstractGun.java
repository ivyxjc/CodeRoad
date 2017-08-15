package xyz.ivyxjc.priciples.lsp.gun;


/**
 * Created by ivyxjc on 2016/10/24.
 */
public abstract class AbstractGun {
    public abstract void shoot();
}


class Handgun extends AbstractGun{
    @Override
    public void shoot() {
        System.out.println("Hangun...");
    }
}

class Rifle extends AbstractGun{
    @Override
    public void shoot() {
        System.out.println("Rifle....");
    }
}

class MachineGun extends AbstractGun{
    @Override
    public void shoot() {
        System.out.println("Machinegun...");
    }
}

class AK47 extends Rifle{
    @Override
    public void shoot() {
        System.out.println("AK47...");
    }
}

class AUG extends Rifle{
    @Override
    public void shoot() {
        System.out.println("AUG...");
    }

    public void zoomOut(){
        System.out.println("zoomOut...");
    }
}