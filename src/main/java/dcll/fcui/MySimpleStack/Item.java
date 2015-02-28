package dcll.fcui.MySimpleStack;

/**
 * Created by Kiwi on 28/02/2015.
 */
public class Item {
    private Object value;

    Item(Object value){
        setValue(value);
    }

    public Object getValue(){
        return value;
    }

    public void setValue(Object value){
        this.value = value;
    }
}
