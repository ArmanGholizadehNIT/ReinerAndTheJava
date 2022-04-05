import armor.FaceArmor;
import org.junit.jupiter.api.Test;
import organ.FaceOrgan;
import titans.ArmoredTitan;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * test har ozv be soorat joda neveshte shode
 * 
 * shive test giri:
 * 1)dmg be hp
 * 2)dmg be armor
 * 3) check kardan inke aya organ az bein rafte ya na
 * 4)dmg be andaze inke armor az bein beravad
 * 5)mohasebe dmg be organ bedon armor
 */

public class TitanTests {

    @Test
   public void FaceOrganTest(){
        ArmoredTitan Titan = ArmoredTitan.create();



        Titan.getFaceOrgan().takeDamage(10);

        assertEquals(23,Titan.getFaceOrgan().getHp()); //remaining hp

        Titan.getFaceOrgan().getArmor().takeDamage(19);

        assertEquals(49,Titan.getFaceOrgan().getArmor().getDurability()); //remaining armor durability



        assertFalse(Titan.getFaceOrgan().takeDamage(0)); //expecting false

        // this force destroys the armor's durability

        assertTrue(Titan.getFaceOrgan().getArmor().takeDamage(88.2)); //expectring true

        Titan.getFaceOrgan().takeDamage(13);
        assertEquals(10,Titan.getFaceOrgan().getHp());

    }


    @Test
    public void LeftArmTest(){
        ArmoredTitan Titan = ArmoredTitan.create();



        Titan.getLeftArmOrgan().takeDamage(10);

        assertEquals(73.75,Titan.getLeftArmOrgan().getHp());

        Titan.getLeftArmOrgan().getArmor().takeDamage(13);

        assertEquals(71 ,Titan.getLeftArmOrgan().getArmor().getDurability());



         //is the organ destroyed?


        assertFalse(Titan.getLeftArmOrgan().takeDamage(0)); //expecting false


         // this force destroys the armor's durability

        assertTrue(Titan.getLeftArmOrgan().getArmor().takeDamage(241.4)); //expecting true


        Titan.getLeftArmOrgan().takeDamage(7.75);
        assertEquals(66,Math.round(Titan.getLeftArmOrgan().getHp()));



    }

    @Test
    public void RightArmTest(){
        ArmoredTitan Titan = ArmoredTitan.create();



        Titan.getRightArmOrgan().takeDamage(12);

        assertEquals(72.5,Titan.getRightArmOrgan().getHp());

        Titan.getRightArmOrgan().getArmor().takeDamage(14);

        assertEquals(71 ,Titan.getRightArmOrgan().getArmor().getDurability());



        //is the organ destroyed?


        assertFalse(Titan.getRightArmOrgan().takeDamage(0)); //expecting false


        // this force destroys the armor's durability

        assertTrue(Titan.getRightArmOrgan().getArmor().takeDamage(245)); //expecting true

        Titan.getRightArmOrgan().takeDamage(13.5);
        assertEquals(59, Math.round(Titan.getRightArmOrgan().getHp()));


    }

    @Test
    public void ChestTest(){
        ArmoredTitan Titan = ArmoredTitan.create();



        Titan.getChestOrgan().takeDamage(200);

        assertEquals(125,Titan.getChestOrgan().getHp());


        Titan.getChestOrgan().getArmor().takeDamage(100);

        assertEquals(107 ,Titan.getChestOrgan().getArmor().getDurability());



        //is the organ destroyed?


        assertFalse(Titan.getChestOrgan().takeDamage(0)); //expecting false


        // this force destroys the armor's durability

        assertTrue(Titan.getChestOrgan().getArmor().takeDamage(1305)); //expecting true

        Titan.getChestOrgan().takeDamage(100);
        assertEquals(25,Titan.getChestOrgan().getHp());


    }

    @Test
    public void StomachTest(){
        ArmoredTitan Titan = ArmoredTitan.create();



        Titan.getStomachOrgan().takeDamage(30);

        assertEquals(35,Titan.getStomachOrgan().getHp());


        Titan.getStomachOrgan().getArmor().takeDamage(100);

        assertEquals(91 ,Titan.getStomachOrgan().getArmor().getDurability());



        //is the organ destroyed?


        assertFalse(Titan.getStomachOrgan().takeDamage(0)); //expecting false


        // this force destroys the armor's durability

        assertTrue(Titan.getStomachOrgan().getArmor().takeDamage(1019)); //expecting true
        assertEquals(0,Titan.getStomachOrgan().getArmor().getDurability());

        Titan.getStomachOrgan().takeDamage(20);
        assertEquals(15,Titan.getStomachOrgan().getHp());


    }


    @Test
    public void NeckTest(){
        ArmoredTitan Titan = ArmoredTitan.create();



        Titan.getNeckOrgan().takeDamage(25);

        assertEquals(26.25,Titan.getNeckOrgan().getHp());


        Titan.getNeckOrgan().getArmor().takeDamage(40);

        assertEquals(31 ,Titan.getNeckOrgan().getArmor().getDurability());



        //is the organ destroyed?


        assertFalse(Titan.getNeckOrgan().takeDamage(0)); //expecting false


        // this force destroys the armor's durability, but does it destroy the organ?

        assertTrue(Titan.getNeckOrgan().getArmor().takeDamage(65.1)); //expecting true

        assertEquals(0,Titan.getNeckOrgan().getArmor().getDurability());

        Titan.getNeckOrgan().takeDamage(6.25);
        assertEquals(20,Titan.getNeckOrgan().getHp());



    }




    @Test
    public void LeftLegTest(){
        ArmoredTitan Titan = ArmoredTitan.create();



        Titan.getLeftLegArmor().takeDamage(33);

        assertEquals(40.15,Titan.getLeftLegArmor().getHp());


        Titan.getLeftLegArmor().getArmor().takeDamage(44);

        assertEquals(106 ,Titan.getLeftLegArmor().getArmor().getDurability());



        //is the organ destroyed?


        assertFalse(Titan.getLeftLegArmor().takeDamage(0)); //expecting false


        // this force destroys the armor's durability

        assertTrue(Titan.getLeftLegArmor().getArmor().takeDamage(1272));//expecting true
        assertEquals(0,Titan.getLeftLegArmor().getArmor().getDurability());

        Titan.getLeftLegArmor().takeDamage(10);
        assertEquals(30.15,Titan.getLeftLegArmor().getHp());


    }

    @Test
    public void RightLegTest(){
        ArmoredTitan Titan = ArmoredTitan.create();



        Titan.getRightLegArmor().takeDamage(41);

        assertEquals(36.55,Titan.getRightLegArmor().getHp());


        Titan.getRightLegArmor().getArmor().takeDamage(56);

        assertEquals(105 ,Titan.getRightLegArmor().getArmor().getDurability());



        //is the organ destroyed?


        assertFalse(Titan.getRightLegArmor().takeDamage(0)); //expecting false


        // this force destroys the armor's durability

        assertTrue(Titan.getRightLegArmor().getArmor().takeDamage(1260)); //expecting true

        assertEquals(0,Titan.getRightLegArmor().getArmor().getDurability());




        Titan.getRightLegArmor().takeDamage(6.55);

        assertEquals(30,Math.round(Titan.getRightLegArmor().getHp()));


    }

    @Test
    public void RightFootTest(){
        ArmoredTitan Titan = ArmoredTitan.create();



        Titan.getRightFootOrgan().takeDamage(31);

        assertEquals(25.8265,Titan.getRightFootOrgan().getHp());


        Titan.getRightFootOrgan().getArmor().takeDamage(56);

        assertEquals(69 ,Titan.getRightFootOrgan().getArmor().getDurability());



        //is the organ destroyed?


        assertFalse(Titan.getRightFootOrgan().takeDamage(0)); //expecting false


        // this force destroys the armor's durability
        Titan.getRightFootOrgan().getArmor().takeDamage(565.8);
        assertEquals(0,Titan.getRightFootOrgan().getArmor().getDurability());

        Titan.getRightFootOrgan().takeDamage(10.8265);

        assertEquals(15,Titan.getRightFootOrgan().getHp());





    }

    @Test
    public void LeftFootTest(){
        ArmoredTitan Titan = ArmoredTitan.create();



        Titan.getLeftFootOrgan().takeDamage(27);

        assertEquals(28.3005,Titan.getLeftFootOrgan().getHp());


        Titan.getLeftFootOrgan().getArmor().takeDamage(71);

        assertEquals(68 ,Titan.getLeftFootOrgan().getArmor().getDurability());



        //is the organ destroyed?


        assertFalse(Titan.getLeftFootOrgan().takeDamage(0)); //expecting false


        // this force destroys the armor's durability
        Titan.getLeftFootOrgan().getArmor().takeDamage(557.6);
        assertEquals(0,Titan.getLeftFootOrgan().getArmor().getDurability());

        Titan.getLeftFootOrgan().takeDamage(12.3005);

        assertEquals(16,Titan.getLeftFootOrgan().getHp());






    }








}
