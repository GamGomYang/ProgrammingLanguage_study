class Weapon{

    protected int fire(){

    return 1;}
}

class Cannon extends Weapon{
    protected int fire(){
        return 10;
    }
}
public class overriding {
public static void main(String[] args) {
    Weapon weapon;
    weapon = new Weapon();

    System.out.println("기본부기의 살상능력은"+weapon.fire());
    weapon = new Cannon();
    System.out.println("대포의 살상 능력은 "+weapon.fire());
}    
}

