package structuralPatterns.adapter;


public class Main {
    public static void main(String[] args) {
        //What its demonstrated here is what is called the object adapter
        //Agregation is used instead of inheritance (adaptee reference is passed in through constructor).
        //Another implementation is called the class adapter or two-way adapter. This class
        //adapter implementation uses inheritance (inherits the adaptee) instead of calling methods
        //on it. It's not considered a good solution so I don't use it here.

        Employee employee = new Employee();

        //create the adapter some employee passed in from somewhere
        Adapter adapter = new Adapter(employee);

        CardDesigner cardDesigner = new CardDesigner(adapter); //passing in the adapter instead of a customerImpl

        String card = cardDesigner.design();
        System.out.println(card);
    }
}
