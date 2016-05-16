package millennia.sniffbt.customRowWithCB;

import java.io.Serializable;

public class RowItem implements Serializable {
    String name;
    int value; /* 0 -> Checkbox deselected ; 1 -> Checkbox selected */

    public RowItem(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public int getValue() {
        return this.value;
    }
}