

public class EtudiantElite extends Etudiant {
    
    public EtudiantElite(int joueur, int id) {
        super(joueur, id);
        this.force = 1;
        this.dexterite = 1;
        this.resistance = 1;
        this.consitution = 5;
        this.initiative = 1;
    }

    @Override
    public String toString() {
        return "EtudiantElite :" + super.toString();
    }
    
}
