package com.im.foo;


import org.junit.Test;
import static org.junit.Assert.*;

public class MolUtilsTest {

    @Test public void testCreateMolecule() throws Exception {
        MolUtils utils = new MolUtils();
        assertNotNull("createMol should return a Molecule", utils.createMol("CCC"));
    }
}
