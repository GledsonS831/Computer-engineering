package br.com.bb;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Assert;

public class contaTest {

    @Test
    public void testSetitular(){
        conta conta = new conta();
        conta.setTitular("Ana");
        Assert.assertEquals("Ana", conta.getTitular());
        conta.setTitular(null);
        Assert.assertEquals("Ana", conta.getTitular());
        conta.setTitular("");
        Assert.assertEquals("Ana", conta.getTitular());
    }

    @Test
    public void testSacar(){
        conta conta = new conta(10, "Mozart",  1000);
        conta.sacar(200.0);
        Assert.assertEquals(800, conta.getSaldo(), 0.0);
        conta.sacar(-100);
        Assert.assertEquals(800,conta.getSaldo(), 0);
    }
    @Test
    public void testNum(){
        conta conta = new conta();
        conta.setNum(12);
        Assert.assertEquals(12, conta.getNum());
    }
    @Test
    public void testSetdeposito(){
        conta conta = new conta(10, "Mozart",  1000);
        conta.depositar(400);
        Assert.assertEquals(1400, conta.getSaldo(), 0.0);
    }

    @Test
    public void testTostring(){
        conta conta = new conta(10, "Mozart",  1000);
        Assert.assertEquals(10, conta.getNum());
        Assert.assertEquals("Mozart", conta.getTitular());
        Assert.assertEquals(1000, conta.getSaldo());
    }
}
