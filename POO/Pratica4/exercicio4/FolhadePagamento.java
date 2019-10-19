public class FolhadePagamento {
    public static void main(String args[]) {
        PorHora h1;
        Empregado listapag[] = new Empregado[10];
        listapag[0] = new PorComissao("Alguem");
        listapag[1] = new PorHora("Outro",12.0);
        listapag[2] = new PorHoraeComissao("Voce nao",21.0,877);
        ((Comission) listapag[0]).setVendas(25000);
        ((Comission) listapag[2]).setVendas(10000);

        for (int i=0; i < listapag.length && listapag[i] != null; i++) {
            if (listapag[i] instanceof PorHora) {
                h1 = (PorHora) listapag[i];
                h1.setNumHora(200);
            }
            listapag[i].printPay();
        }
    }
}