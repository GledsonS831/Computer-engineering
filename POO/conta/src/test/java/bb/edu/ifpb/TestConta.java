package bb.edu.ifpb;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TestConta
{
    Conta_Banco conta = new Conta_Banco();
    @Test
    public void Test_setNum(){
        Assert.assertEquals(1, conta.getNum());
    }

    @Test
    public void Test_setDeposit(){
        conta.setDeposit(80);
        Assert.assertEquals(180, conta.getBalance(), 180);
        conta.setDeposit(-90);
        Assert.assertEquals(180, conta.getBalance(), 0);
    }

    @Test
    public void Test_setName(){
        Assert.assertEquals("User Undefined", conta.getName());
        conta.setName(null);
        Assert.assertEquals("User Undefined", conta.getName());
    }


}
