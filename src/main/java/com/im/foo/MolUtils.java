package com.im.foo;

import chemaxon.formats.MolFormatException;
import chemaxon.formats.MolImporter;
import chemaxon.struc.Molecule;

public class MolUtils {

    public Molecule createMol(String mol) throws MolFormatException {
        return MolImporter.importMol(mol);
    }
}
