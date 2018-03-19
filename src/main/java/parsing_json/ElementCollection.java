package parsing_json;

import java.util.*;

public class ElementCollection extends ArrayList<Element> {

    private Object fieldName;

    public Element findByAtomicNumber(int atomic_number) {
        ListIterator<Element> list = listIterator(atomic_number);
        while (list.hasNext()) {
            Element element = list.next();
            if (element.getSymbol().equals(atomic_number))
                return element;

        }
        return null;


    }


    public Element findByName(String name) {
        ListIterator<Element> list = listIterator();
        while (list.hasNext()) {
            Element element = list.next();
            if (element.getName().equals(name))
                System.out.println(element);
            return element;
        }
        return null;


        public ElementCollection where (String fieldName, Object value)throw NoSuchFieldException {


        }


    }
}





