public class Player {

    private String name = "Anthony";
    private double ptsLife = 20;
    private double ptsAttack = 0.5;

    public Player() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPtsLife() {
        return ptsLife;
    }

    public void setPtsLife(double ptsLife) {
        this.ptsLife = ptsLife;
    }

    public double getPtsAttack() {
        return ptsAttack;
    }

    public void setPtsAttack(double ptsAttack) {
        this.ptsAttack = ptsAttack;
    }
}
