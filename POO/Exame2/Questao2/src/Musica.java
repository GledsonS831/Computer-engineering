import java.util.LinkedList;
import java.util.List;

public class Musica {
    public static void main(String []args){
        Percussao p1 = new Percussao("Bateria Maluca");
        Percussao p2 = new Percussao("Bateria do carinha");
        Corda c1 = new Corda("Violao");
        Corda c2 = new Corda("Guitarra");
        SoproMadeira sp = new SoproMadeira("Flauta especial");
        Latao lat = new Latao("Grande Latao");
        LinkedList<Instrumento> vi = new LinkedList<>();
        vi.add(p1);
        vi.add(p2);
        vi.add(c1);
        vi.add(c2);
        vi.add(sp);
        vi.add(lat);
        todasMelodias(vi);
    }
    public static void melodia(Instrumento i){

        i.tocar();
        i.qual();
    }

    public static void todasMelodias(List<Instrumento> vi){
        for(int i = 0; i < vi.size(); i++){
            melodia(vi.get(i));
        }
    }
}
