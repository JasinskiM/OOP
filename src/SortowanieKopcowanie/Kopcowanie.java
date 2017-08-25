package SortowanieKopcowanie;

/**
 * Created by RENT on 2017-08-25.
 */
public class Kopcowanie {
    private int[] _data;
    private int _iterator = 0;

    Kopcowanie(int length){
        _data = new int[length];
    }

    public void addElement(int element){
        int i = _iterator;
        _iterator++;
        int j = Math.floorDiv(i - 1,2);
        while (i > 0 && _data[j] < element){
            _data[i] = _data[j];
            i = j;
            j = Math.floorDiv(i - 1, 2);
        }

        _data[i] = element;
    }
}
