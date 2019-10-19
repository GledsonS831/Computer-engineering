public class TestaConta {
    public static void main(String[] args) {
        Conta cc = new Conta();
        cc.deposita(2000);
        try {
            cc.saque(2300);
        } catch (ValorInsuficienteSaqueException e) {
            e.printStackTrace();
        }
    }
}
