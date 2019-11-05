public class MaisRecente implements Predicado{
    private String data;

    public MaisRecente(String data){
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public boolean testa(Pasta p) {
        if( p.getData().compareTo(this.data) > 0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean testa(Link l) {
        if( l.getData().compareTo(this.data) > 0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean testa(ArqDados ad) {
        if( ad.getData().compareTo(this.data) > 0){
            return true;
        }
        else{
            return false;
        }
    }
}
