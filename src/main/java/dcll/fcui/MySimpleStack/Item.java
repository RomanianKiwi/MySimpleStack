package dcll.fcui.MySimpleStack;

/**
 * Created by Kiwi on 28/02/2015.
 */
public class Item {
    private Object value;

    Item(Object value){
        setValue(value);
    }

    // Commentaire répondant à l'exigence 1
    public Object getValue(){
        return value;
    }

    public void setValue(Object value){
        this.value = value;
    }
}
