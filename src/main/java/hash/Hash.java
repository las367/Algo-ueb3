package hash;

public class Hash implements IHash {

    private int size;

    @Override
    public int hash(int key) {

        return key % size;
    }
    
}