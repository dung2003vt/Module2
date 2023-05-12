import java.util.Collection;
public class MyUtils {
    public static <T> int count(Collection<T> collection,T itemsToCount){
        int count = 0;
        for (T items: collection){
            if (itemsToCount.equals(items))
            count++;
        }
        return count;
    }
}
