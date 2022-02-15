import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
    public static void main(String[] args) {
        //Array
        /*
        * homogeneous
        * while initialization,we have to declare the size
        *
        * */
        int[] arr = new int[9];
        arr[6]=7;
        int i ='a';
        for (int v:arr)
            System.out.println(v);

        /*
        * hetrogeneous
        * flexible in size
        * implement Itereator:
        * It will only store object
        *
       */
        ArrayList arrayList=new ArrayList();
        arrayList.add(1);
        arrayList.add("sandeep");
       // arrayList.add(10,"varma");
        System.out.println(arrayList);

       /* Object Object;
        Inheritance->Object obj =new Child()
            0->new Demo(),9->new
        for (Object v:arrayList){
            Demo demo =(Demo) v;
            System.out.println(v);
        }*/
        Iterator iterator=arrayList.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        //wecan make arrayList homogeneous

        ArrayList<Integer>integers=new ArrayList<>(15);
        integers.add(1);
        integers.add(12);
        integers.add(null);
        
    }
}
