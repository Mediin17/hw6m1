public class Skeleton extends Boss{
    private int arrows;


    public int getArrows() {

        return arrows;
    }
    public void setArrows(int arrows) {

        this.arrows = arrows;
    }

    @Override
    public String printInfo() {
        return super.printInfo()+ "\nArrows:"+getArrows();
    }
    public String Info() {
        return super.Info()+ "\nArrows:"+getArrows();
    }
    public String info() {
        return super.info()+ "\nArrows:"+getArrows();
    }
}
