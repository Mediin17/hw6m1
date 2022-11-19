public class Main {
    public static void main(String[] args){
        Boss boss=new Boss();
        boss.setHealth(250);
        boss.setDamage(50);
        boss.weapon.setWeaponstype(WeaponType.COLD);



        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealthS1(300);
        skeleton1.setDamageS1(25);
        skeleton1.weapon.setWeaponstype(WeaponType.TOY);

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealthS2(150);
        skeleton2.setDamageS2(20);
        skeleton2.weapon.setWeaponstype(WeaponType.GAS);

        skeleton1.setArrows(30);
        skeleton2.setArrows(50);
        System.out.println(boss.printInfo());
        System.out.println(skeleton1.Info());
        System.out.println(skeleton2.info());



    }


}
