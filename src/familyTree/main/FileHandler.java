package familyTree.main;

import familyTree.familyTree.FamilyTree;
import familyTree.human.Human;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {

    public void writer (FamilyTree list, String fileName) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
        out.writeObject(list);
        out.close();
    }

    public FamilyTree reader (String fileName) throws IOException {
        FamilyTree list = new FamilyTree();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
        return  list;
    }

}
