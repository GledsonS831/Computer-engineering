public class UsaRestaurante {

    public static void main(String []args){

        Restaurante restaurante = new Restaurante();

        Mesa m1 = new Mesa("alguem", 56);
        m1.addArray(new Pedido("carne", 20));
        m1.addArray(new Pedido("sorvete", 5));

        Mesa m2 = new Mesa("outro", 98);
        m2.addArray(new Pedido("mouse?", 88));
        m2.addArray(new Pedido("pastel", 7));

        restaurante.adicionaMesa(m1);
        restaurante.adicionaMesa(m2);

        //restaurante.removerMesa(m1);
        restaurante.removerMesa(m2);

        for(Mesa i: restaurante.getArrMesas()){
            for(Pedido p: i.getArr()){
                System.out.println(p.getNome()+" "+p.getValor());
            }
        }
        System.out.println(restaurante.getFaturamento());

    }
}
