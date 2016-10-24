package priciples.lsp.gun;

import edu.princeton.algs4.StdOut;

/**
 * Created by yanjiusuo4 on 2016/10/24.
 */
public abstract class AbstractGun {
    public abstract void shoot();
}


class Handgun extends AbstractGun{
    @Override
    public void shoot() {
        StdOut.println("Hangun...");
    }
}

class Rifle extends AbstractGun{
    @Override
    public void shoot() {
        StdOut.println("Rifle....");
    }
}

class MachineGun extends AbstractGun{
    @Override
    public void shoot() {
        StdOut.println("Machinegun...");
    }
}

class AK47 extends Rifle{
    @Override
    public void shoot() {
        StdOut.println("AK47...");
    }
}

class AUG extends Rifle{
    @Override
    public void shoot() {
        StdOut.println("AUG...");
    }

    public void zoomOut(){
        StdOut.println("zoomOut...");
    }
}