public class Boss extends GameEntity {
    Weapon weapon = new Weapon();


    public Boss() {
       super();
    }


    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


    public String printInfo() {
        return "Boss health: " + getHealth()
                + "\nBoss damage: " + getDamage()
                + "\nBoss weapon type: " + weapon.getWeaponstype();
    }

    public String Info() {
        return "Skeleton1 health: " + getHealthS1()
                + "\nSkeleton1 damage: " + getDamageS1()
                + "\nSkeleton1 weapon type: " + weapon.getWeaponstype();
    }
    public String info() {
        return "Skeleton2 health: " + getHealthS2()
                + "\nSkeleton2 damage: " + getDamageS2()
                + "\nSkeleton2 weapon type: " + weapon.getWeaponstype();
    }

}



