import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {


    public static void main (String[] args) {

        Box big = new Box(45.7, 30.0, 38.5);
        Box middle = new Box(37.6, 24.9, 33.2);
        Box small = new Box(24.6, 18.5, 20.6);

        List<Box> normalBoxes = new ArrayList<>();
        List<Box> bigBoxes = new ArrayList<>();

        normalBoxes.add(big);
        normalBoxes.add(middle);
        normalBoxes.add(small);

        checkBoxWidth30(normalBoxes, bigBoxes);

        for (int i = 0; i < normalBoxes.size(); i++) {
            System.out.println(normalBoxes.get(i).toString());
        }
        System.out.println("--------");
        for (int i = 0; i < bigBoxes.size(); i++) {
            System.out.println(bigBoxes.get(i).toString());
        }
    }

    public static void checkBoxWidth30(List<Box> firstBox, List<Box> secondBox) {

        Iterator<Box> boxIterator = firstBox.iterator();

        while(boxIterator.hasNext()) {
            Box nextBox = boxIterator.next();
            if (nextBox.getWidth() > 30) {   //
                secondBox.add(nextBox);
                boxIterator.remove();
            }
        }

//        boxIterator.forEachRemaining(box -> {
//            if (box.getWidth() > 30) {
//                secondBox.add(box);
//                boxIterator.remove();
//            }
//        });
    }
}