/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import thegame.thegame.Urn;

/**
 *
 * @author afellman
 */
public class UrnTest {
    Urn urn;
    public UrnTest() {
    }
    
    
    @Before
    public void setUp() {
        urn = new Urn();
    }
    
    
    @Test
    public void UrnInitializationGivesRightAmountOfBricks(){
        urn.InitializeUrn();
        assertEquals(96, urn.getLength());
    }
    


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
